import { IResolvers } from 'graphql-tools';


const query : IResolvers = {
    Query : {
        hola(): string {
            return 'Hola mundo'
        },
        holaConNombre(__: void, {nombre } ): string {
            return `Hola mi estimado ${nombre}`
        },
        holaAlCursoGraphQL(): string {
            return 'Hola al curso de GraphQL'
        }
    }
}

export default query