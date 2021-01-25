import { GraphQLSchema } from 'graphql';
import { makeExecutableSchema } from 'graphql-tools';
import 'graphql-import-node'; // muy importante para traer el contenido de un fichero con extension graphql
import typeDefs from './schema.graphql';
import resolvers from '../resolvers/resolversMap'

const schema: GraphQLSchema = makeExecutableSchema({
    typeDefs,
    resolvers
})

export default schema