package hello;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Osoba {
	String imię, Nazwisko;
	LocalDate dataurodzenia;
	LocalTime godzina;
	public Osoba(String imię, String nazwisko, LocalDate dataurodzenia, LocalTime godzina) {
		this.imię = imię;
		Nazwisko = nazwisko;
		this.dataurodzenia = dataurodzenia;
		this.godzina = godzina;
	}
	public String getImię() {
		return imię;
	}
	public void setImię(String imię) {
		this.imię = imię;
	}
	public String getNazwisko() {
		return Nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	public LocalDate getDataurodzenia() {
		return dataurodzenia;
	}
	public void setDataurodzenia(LocalDate dataurodzenia) {
		this.dataurodzenia = dataurodzenia;
	}
	public LocalTime getGodzina() {
		return godzina;
	}
	public void setGodzina(LocalTime godzina) {
		this.godzina = godzina;
	}
	@Override
	public String toString() {
		return "Osoba [imię=" + imię + ", Nazwisko=" + Nazwisko + ", dataurodzenia=" + dataurodzenia + ", godzina="
				+ godzina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Nazwisko, dataurodzenia, godzina, imię);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(Nazwisko, other.Nazwisko) && Objects.equals(dataurodzenia, other.dataurodzenia)
				&& Objects.equals(godzina, other.godzina) && Objects.equals(imię, other.imię);
	}
	
	
	

}
