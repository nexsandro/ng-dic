interface Term {
    id: number,
    text: string,
    language: number
}

interface Keyword {
    id: number,
    key: string,
    terms: Term[]
}