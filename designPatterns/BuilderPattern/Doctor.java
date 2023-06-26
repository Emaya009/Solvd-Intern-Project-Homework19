package pharmacy.designPatterns.BuilderPattern;

public class Doctor {
        private final String name;
        private final String specialization;
        private final String phone;

        private Doctor(DoctorBuilder builder) {
            this.name = builder.name;
            this.specialization = builder.specialization;
            this.phone = builder.phone;
        }

        public String getName() {
            return name;
        }

        public String getSpecialization() {
            return specialization;
        }

        public String getPhone() {
            return phone;
        }

        public static class DoctorBuilder {
            private String name;
            private String specialization;
            private String phone;

            public DoctorBuilder setName(String name) {
                this.name = name;
                return this;
            }

            public DoctorBuilder setSpecialization(String specialization) {
                this.specialization = specialization;
                return this;
            }

            public DoctorBuilder setPhone(String phone) {
                this.phone = phone;
                return this;
            }

            public Doctor build() {
                return new Doctor(this);
            }
        }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

