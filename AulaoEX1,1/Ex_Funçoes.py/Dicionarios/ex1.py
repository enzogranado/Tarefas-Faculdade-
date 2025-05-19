# Exercício 1, criando dicionarios:
funcionario = {
    'nome':'Maria',
    'cargo':'analista de dados',
    'status': True
}
print(funcionario['nome'])
print(funcionario['cargo'])
print(funcionario.get('email', 'Não informado'))

# adicionando o campo email.
funcionario['email'] = 'm@gmail'
print(funcionario.items())
# removendo o campo pop
item_removido = funcionario.pop('status') 
print('Valor removido (status):' , item_removido)
print('dicionario pos remoção:', funcionario)
# percorrendo o dicionario 'CHAVES:
for chave in funcionario:
    print(chave)
print('*********')
# percorrendo o dicionario 'Values'
for valor in funcionario.values():
    print(valor)
    