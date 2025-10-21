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
 * A representation of the model object '<em><b>Lebenspartnerschaft Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten für zusätzliche Daten zur Lebensparternschaft. Regel: Falls der Familienstand des Antragstellenden Elternteils "eingetragene Lebenspartnerschaft" ist
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebend <em>Getrennt Lebend</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerSeitSechsMonatenInAnstalt <em>Lebenspartner Seit Sechs Monaten In Anstalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilName <em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilAnschrift <em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum <em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasse <em>Steuerklasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasseNachweis <em>Steuerklasse Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType()
 * @model extendedMetaData="name='Lebenspartnerschaft.Antragstellende.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LebenspartnerschaftAntragstellendeBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten, ob Trennung vorliegt. Es kann ein Nachweis (z.B. Antrag auf Scheidung bei Gericht) mitgeliefert werden. Regel: Falls vom Lebenspartner getrennt lebend angegeben wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getrennt Lebend</em>' containment reference.
	 * @see #setGetrenntLebend(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_GetrenntLebend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getrenntLebend' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getGetrenntLebend();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebend <em>Getrennt Lebend</em>}' containment reference.
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
	 * Daten zum getrennt Leben. Es kann hier weitere Informationen (z.B. Gründe) gesendet werden. Regel: Falls vom Lebenspartner getrennt gelebt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getrennt Lebend Grund</em>' attribute.
	 * @see #setGetrenntLebendGrund(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_GetrenntLebendGrund()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='getrenntLebendGrund' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGetrenntLebendGrund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getrennt Lebend Grund</em>' attribute.
	 * @see #getGetrenntLebendGrund()
	 * @generated
	 */
	void setGetrenntLebendGrund(String value);

	/**
	 * Returns the value of the '<em><b>Lebenspartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Nachweis (z.B. Bescheid oder Schreiben). Regel: Falls der Lebenspartner in einer Anstalt lebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartner Seit Sechs Monaten In Anstalt</em>' containment reference.
	 * @see #setLebenspartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerSeitSechsMonatenInAnstalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerSeitSechsMonatenInAnstalt' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getLebenspartnerSeitSechsMonatenInAnstalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerSeitSechsMonatenInAnstalt <em>Lebenspartner Seit Sechs Monaten In Anstalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartner Seit Sechs Monaten In Anstalt</em>' containment reference.
	 * @see #getLebenspartnerSeitSechsMonatenInAnstalt()
	 * @generated
	 */
	void setLebenspartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Namen. Regel: Falls der Lebenspartner nicht der andere Elternteil ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>' containment reference.
	 * @see #setLebenspartnerIstNichtDerAndereElternteilName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerIstNichtDerAndereElternteilName' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getLebenspartnerIstNichtDerAndereElternteilName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilName <em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>' containment reference.
	 * @see #getLebenspartnerIstNichtDerAndereElternteilName()
	 * @generated
	 */
	void setLebenspartnerIstNichtDerAndereElternteilName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Anschrift. Regel: Falls der Lebenspartner nicht der andere Elternteil ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>' containment reference.
	 * @see #setLebenspartnerIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilAnschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerIstNichtDerAndereElternteilAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftOptionalType getLebenspartnerIstNichtDerAndereElternteilAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilAnschrift <em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>' containment reference.
	 * @see #getLebenspartnerIstNichtDerAndereElternteilAnschrift()
	 * @generated
	 */
	void setLebenspartnerIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType value);

	/**
	 * Returns the value of the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Geburtsdatum. Regel: Falls der Lebenspartner nicht der andere Elternteil ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>' containment reference.
	 * @see #setLebenspartnerIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilGeburtsdatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerIstNichtDerAndereElternteilGeburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum <em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>' containment reference.
	 * @see #getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum()
	 * @generated
	 */
	void setLebenspartnerIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Steuerklasse. Regel: Es sind nur die Werte 1 bis 6 zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerklasse</em>' attribute.
	 * @see #setSteuerklasse(BigInteger)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_Steuerklasse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='steuerklasse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSteuerklasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasse <em>Steuerklasse</em>}' attribute.
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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_SteuerklasseNachweis()
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
	 * Seit wann liegt die eingetragene Lebenspartnerschaft vor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seit Wann</em>' attribute.
	 * @see #setSeitWann(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAntragstellendeBasisType_SeitWann()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='seitWann' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSeitWann();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seit Wann</em>' attribute.
	 * @see #getSeitWann()
	 * @generated
	 */
	void setSeitWann(XMLGregorianCalendar value);

} // LebenspartnerschaftAntragstellendeBasisType
