# elemental-monster-duel-mapper

## 📌 Overview

**elemental-monster-duel-mapper** is one of 6 repositories in the distributed
architecture of Elemental Monster Duel. It holds MapStruct mappers —
centralized object-to-object conversion logic.

---

## 🎯 Purpose

This repository exists to:

- Convert between persistence objects and transport objects, in both directions
- Centralize that conversion logic in one place instead of scattering it
  across callers
- Let callers avoid needing to know both shapes at once

---

## 🧱 Project Architecture Context

This repo is one of 6 in the Elemental Monster Duel ecosystem, each
independently versioned and maintained:

| Module | Responsibility | Repository |
|---|---|---|
| `db` | Database schema | https://github.com/D3vlin/elemental-monster-duel-db |
| `entity` | JPA mapping | https://github.com/D3vlin/elemental-monster-duel-entity |
| `dto` | Data transport | https://github.com/D3vlin/elemental-monster-duel-dto |
| `mapper` | Entity ↔ DTO | — (this) |
| `api` | REST interface | https://github.com/D3vlin/elemental-monster-duel-api |
| `ui` | Frontend | https://github.com/D3vlin/elemental-monster-duel-ui |

---

## 🚀 Why a Dedicated Mapper Module?

- Keeps the two sides of a conversion from ever depending on each other
- One place to test every conversion, instead of scattered across callers
- Callers stay focused on orchestration, not object shaping

---

## License

No license — all rights reserved.
