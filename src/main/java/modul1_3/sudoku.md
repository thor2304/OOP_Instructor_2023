# Hvordan ville du repræsentere en sudoku plade i Java?
`int[][] plade`

# Hvordan hænger denne datastruktur sammen i hukommelsen?
Der er et sammenhængende stykke af memory til hvert indre array: `int[] indre = plade[i]`.
Det ydre array, har så et sammenhængende stykke memory til at gemme pointers til hvert indre array.
De indre arrays behøver således ikke at ligge i et sammenhængende stykke memory.