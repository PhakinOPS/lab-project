# Backend Lab – Session 1 & 2

## Session 1: Logic & Coding
**วันที่:** 23 สิงหาคม 2025  
**เป้าหมาย:** เข้าใจ pattern ของโจทย์ง่าย ๆ และ mini-exercise

### โจทย์ที่เรียนรู้
1. **Two Sum** – ใช้ HashMap หาคู่ตัวเลขที่รวมได้ target
2. **Reverse String** – ใช้ pointer สลับตัวอักษรใน array
3. **Valid Anagram** – นับตัวอักษรด้วย array/HashMap แล้วตรวจสอบ equality

### Mini-exercise
- **SumArray** – บวกตัวเลขใน array
- **CountCharacters** – นับจำนวนตัวอักษรใน string

**หมายเหตุ:** วันนี้เน้น **อ่านเฉลย + เข้าใจ logic** ไม่เน้นเขียนโจทย์เองหลายข้อ

---

## Session 2: Backend Practice
**เป้าหมาย:** สร้าง API ง่าย ๆ ใน Spring Boot

### API ที่สร้าง
1. **GET /hello** – return `"Hello World!"`
2. **POST /sum** – รับ array ของตัวเลข → return ผลรวม

### การทดสอบ
- ใช้ **Postman**
- ตัวอย่าง POST /sum Body JSON:
```json
[2,7,11,15]

### Features Added in Session 1
- Task model with `id`, `title`, `description`
- In-memory CRUD operations via `TaskService`
- REST endpoints in `TaskController`:
  - GET /tasks
  - GET /tasks/{id}
  - POST /tasks
  - PUT /tasks/{id}
  - DELETE /tasks/{id}
- Tested endpoints using Postman
