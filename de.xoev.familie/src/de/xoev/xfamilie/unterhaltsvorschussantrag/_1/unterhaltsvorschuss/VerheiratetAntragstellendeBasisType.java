/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verheiratet Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Datentyp für zusätzliche Daten zu verheiratet. Regel: Falls der Familienstand des Antragstellenden Elternteils "verheiratet" ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebend <em>Getrennt Lebend</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhepartnerSeitSechsMonatenInAnstalt <em>Ehepartner Seit Sechs Monaten In Anstalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteillName <em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilAnschrift <em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilGeburtsdatum <em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasse <em>Steuerklasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasseNachweis <em>Steuerklasse Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType()
 * @model extendedMetaData="name='Verheiratet.Antragstellende.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VerheiratetAntragstellendeBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten, ob Trennung vorliegt. Es kann ein Nachweis (z.B. Antrag auf Scheidung bei Gericht) mitgeliefert werden. Regel: Falls vom Ehepartner getrennt lebend angegeben wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getrennt Lebend</em>' containment reference.
	 * @see #setGetrenntLebend(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_GetrenntLebend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getrenntLebend' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getGetrenntLebend();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebend <em>Getrennt Lebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getrennt Lebend</em>' containment reference.
	 * @see #getGetrenntLebend()
	 * @generated
	 */
	void setGetrenntLebend(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum getrennt Leben. Es können hier weitere Informationen (z.B. Gruende) gesendet werden. Regel: Falls vom Ehegatten getrennt gelebt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getrennt Lebend Grund</em>' attribute.
	 * @see #setGetrenntLebendGrund(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_GetrenntLebendGrund()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='getrenntLebendGrund' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGetrenntLebendGrund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getrennt Lebend Grund</em>' attribute.
	 * @see #getGetrenntLebendGrund()
	 * @generated
	 */
	void setGetrenntLebendGrund(String value);

	/**
	 * Returns the value of the '<em><b>Ehepartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Partner in einer Anstalt. Es kann ein Nachweis (z.B.Bescheid oder Schreiben) mitgesendet werden. Regel: Falls der Ehegatte in einer Anstalt lebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ehepartner Seit Sechs Monaten In Anstalt</em>' containment reference.
	 * @see #setEhepartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_EhepartnerSeitSechsMonatenInAnstalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ehepartnerSeitSechsMonatenInAnstalt' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getEhepartnerSeitSechsMonatenInAnstalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhepartnerSeitSechsMonatenInAnstalt <em>Ehepartner Seit Sechs Monaten In Anstalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ehepartner Seit Sechs Monaten In Anstalt</em>' containment reference.
	 * @see #getEhepartnerSeitSechsMonatenInAnstalt()
	 * @generated
	 */
	void setEhepartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Ehegatte Ist Nicht Der Andere Elternteill Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Namen des anderen Elternteils. Regel: Falls der Ehegatte nicht der andere Elternteil ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>' containment reference.
	 * @see #setEhegatteIstNichtDerAndereElternteillName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteillName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ehegatteIstNichtDerAndereElternteillName' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getEhegatteIstNichtDerAndereElternteillName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteillName <em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>' containment reference.
	 * @see #getEhegatteIstNichtDerAndereElternteillName()
	 * @generated
	 */
	void setEhegatteIstNichtDerAndereElternteillName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Anschrift des anderen Elternteils. Regel: Falls der Ehegatte nicht der andere Elternteil ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>' containment reference.
	 * @see #setEhegatteIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteilAnschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ehegatteIstNichtDerAndereElternteilAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftOptionalType getEhegatteIstNichtDerAndereElternteilAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilAnschrift <em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>' containment reference.
	 * @see #getEhegatteIstNichtDerAndereElternteilAnschrift()
	 * @generated
	 */
	void setEhegatteIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType value);

	/**
	 * Returns the value of the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Geburtdatum des anderen Elternteils. Regel: Falls der Ehegatte nicht der andere Elternteil ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>' containment reference.
	 * @see #setEhegatteIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteilGeburtsdatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ehegatteIstNichtDerAndereElternteilGeburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getEhegatteIstNichtDerAndereElternteilGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilGeburtsdatum <em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>' containment reference.
	 * @see #getEhegatteIstNichtDerAndereElternteilGeburtsdatum()
	 * @generated
	 */
	void setEhegatteIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Steuerklasse. Regel: Es sind nur die Werte 1 bis 6 zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerklasse</em>' attribute.
	 * @see #setSteuerklasse(BigInteger)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_Steuerklasse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='steuerklasse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSteuerklasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasse <em>Steuerklasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerklasse</em>' attribute.
	 * @see #getSteuerklasse()
	 * @generated
	 */
	void setSteuerklasse(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweis zur Steuerklasse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerklasse Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_SteuerklasseNachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='steuerklasseNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSteuerklasseNachweis();

	/**
	 * Returns the value of the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seit wann liegt die Ehe vor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seit Wann</em>' attribute.
	 * @see #setSeitWann(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getVerheiratetAntragstellendeBasisType_SeitWann()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='seitWann' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSeitWann();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seit Wann</em>' attribute.
	 * @see #getSeitWann()
	 * @generated
	 */
	void setSeitWann(XMLGregorianCalendar value);

} // VerheiratetAntragstellendeBasisType
