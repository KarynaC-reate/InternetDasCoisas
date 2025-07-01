#1-cadastrar candidatos, 2-votar, 3-resultado votos, 4-sair do programa.
#dicionario
candidatos = {}

def cadastrar_candidato():
    while True:
        nome_cand = input("Digite o nome do candidato (ou 'pronto' para concluir): ")
        if nome_cand.lower() == 'pronto':
            break
        candidatos[nome_cand] = 0

def votar():
    while True:
        nome_cand = input("Digite o nome do candidato para votar (ou 'sair' para encerrar): ")
        if nome_cand.lower() == 'sair':
            break
        if nome_cand in candidatos:
            candidatos[nome_cand] += 1
        else:
            print("Não encontrado. Tente novamente.")

def mostrar_resultados():
    print("\nResultados da votação:")
    for candidato, votos in candidatos.items():
        print(f"{candidato}: {votos} votos")

print("Cadastro de Candidatos:")
cadastrar_candidato()

print("\nVotação:")
votar()

mostrar_resultados()
