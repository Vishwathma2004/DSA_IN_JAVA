def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    def parse_data(data):
        n = int(data[0])
        cases = []
        index = 1
        for _ in range(n):
            x = int(data[index])
            index += 1
            case = list(map(int, data[index:index + x]))
            cases.append(case)
            index += x
        return cases

    def sum_of_squares(case):
        return sum(map(lambda y: y*y, filter(lambda y: y >= 0, case)))

    def process_cases(cases):
        return list(map(sum_of_squares, cases))

    cases = parse_data(data)
    results = process_cases(cases)
    for result in results:
        print(result)

if __name__ == "__main__":
    main()
