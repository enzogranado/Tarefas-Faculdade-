#criação de um carrinho de compras:
carrinho = [
    {'nome_prod':'picanha', 'quantidade': 4, 'preco':120},
    {'nome_prod': 'banana', 'quantidade': 2, 'preco':3}, 
    {'nome_prod':'maminha', 'quantidade':1, 'preco':50}   
]
print(carrinho[0]['nome_prod'])
print(carrinho[1]['nome_prod'])
print(carrinho[2]['nome_prod'])
#calculando o valor total de cada produto
preco1 = (carrinho[0]['quantidade'])*(carrinho[0]['preco'])
preco2 = (carrinho[1]['quantidade'])*(carrinho[1]['preco'])
preco3 = (carrinho[2]['quantidade'])*(carrinho[2]['preco'])
print('Preço do primeiro produto: ' ,carrinho[0]['nome_prod'] ,preco1)
print('Preço do primeiro produto: ' ,carrinho[1]['nome_prod'] ,preco2)
print('Preço do primeiro produto: ' ,carrinho[2]['nome_prod'] ,preco3)
# calculando o valor total: 
valor_compra = preco3 + preco1 + preco2
print(valor_compra)
# adicionando um novo produto
carrinho.append({'nome_prod':'lapis', 'quantidade':5, 'preco':0.9}) 
print(carrinho)
#alterando valores
carrinho[0]['quantidade']=2 #alteramos a quantidade de picanha
print(carrinho)
#removendo um item
item_removido = carrinho.pop(1) 
print('Aqui esta o item removido ', item_removido)
print('o carrinho final ficou assim:', carrinho)