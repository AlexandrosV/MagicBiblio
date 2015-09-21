/*
 * Copyright (c) 2015, Freddy Alejandro Villamarin Moncayo and Joel Adrian Rivera Moncayo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *  list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package magicbiblio.entities;

/**
 *
 * @author AlexandrosVM
 */
public class Author {

    private final String name;
    private final String middleName;
    private final String surname;
    private final String secondSurname;
    private final String nameAsInstitution;

    public static class AuthorBuilder {

        private String name;
        private String middleName;
        private String surname;
        private String secondSurname;
        private String nameAsInstitution;

        public AuthorBuilder() {

        }

        public Author build() {
            return new Author(this);
        }

        public AuthorBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AuthorBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public AuthorBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public AuthorBuilder secondSurname(String secondSurame) {
            this.secondSurname = secondSurname;
            return this;
        }

        public AuthorBuilder nameAsInstitution(String nameAsInstitution) {
            this.nameAsInstitution = nameAsInstitution;
            if (!nameAsInstitution.isEmpty()) {
                this.name = "null";
                this.middleName = "null";
                this.surname = "null";
                this.secondSurname = "null";
            }
            return this;
        }

    }

    private Author(AuthorBuilder builder) {
        this.name = builder.name;
        this.middleName = builder.middleName;
        this.surname = builder.surname;
        this.secondSurname = builder.secondSurname;
        this.nameAsInstitution = builder.nameAsInstitution;
    }
}
