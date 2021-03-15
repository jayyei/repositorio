import graphene
from graphene_django import DjangoObjectType
from .models import Books  # Should be name as Book


# Step 1 create your graph object using a django model
class BooksType(DjangoObjectType):
    class Meta:
        model = Books
        fields = ('id', 'title', 'excerpt')


# step 2 define query class, here you can customize responses
class Query(graphene.ObjectType):

    all_books = graphene.List(BooksType)

    def resolve_all_books(root, info):
        return Books.objects.all()



# step 3 create your schema
schema = graphene.Schema(query=Query)