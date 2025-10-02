#include <iostream>
#include <unordered_map>

// Используем готовую реализацию из STL
int main() {
    std::unordered_map<std::string, int> ht;

    // Добавляем элементы
    ht["apple"] = 5;
    ht["banana"] = 3;
    ht["orange"] = 8;

    // Выводим содержимое
    for (const auto& pair : ht) {
        std::cout << pair.first << " -> " << pair.second << std::endl;
    }

    // Получаем значения
    std::cout << "apple -> " << ht["apple"] << std::endl;
    std::cout << "banana -> " << ht.at("banana") << std::endl;

    return 0;
}
