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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Pflegekind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Pflegekind
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getBeginnPflegeverhaeltnis <em>Beginn Pflegeverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichert <em>Krankenversichert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichertUeberPflegeperson <em>Krankenversichert Ueber Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getSchuleAusbildungsstaette <em>Schule Ausbildungsstaette</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKlassenstufeAusbildungsjahr <em>Klassenstufe Ausbildungsjahr</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getEinkommenPflegekind <em>Einkommen Pflegekind</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType()
 * @model extendedMetaData="name='AngabenPflegekindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenPflegekindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_Personendaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getPersonendaten <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personendaten</em>' containment reference.
	 * @see #getPersonendaten()
	 * @generated
	 */
	void setPersonendaten(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Geburtsdatum und Geburtsort
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtOptionalType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Straße, Hausnummer, PLZ und Wohnort
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(MeldeanschriftType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	MeldeanschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(MeldeanschriftType value);

	/**
	 * Returns the value of the '<em><b>Beginn Pflegeverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginn des Pflegeverhältnisses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beginn Pflegeverhaeltnis</em>' attribute.
	 * @see #setBeginnPflegeverhaeltnis(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_BeginnPflegeverhaeltnis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='beginnPflegeverhaeltnis' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBeginnPflegeverhaeltnis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getBeginnPflegeverhaeltnis <em>Beginn Pflegeverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn Pflegeverhaeltnis</em>' attribute.
	 * @see #getBeginnPflegeverhaeltnis()
	 * @generated
	 */
	void setBeginnPflegeverhaeltnis(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Krankenversichert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Krankenversichert bei
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Krankenversichert</em>' attribute.
	 * @see #setKrankenversichert(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_Krankenversichert()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='krankenversichert' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKrankenversichert();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichert <em>Krankenversichert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krankenversichert</em>' attribute.
	 * @see #getKrankenversichert()
	 * @generated
	 */
	void setKrankenversichert(String value);

	/**
	 * Returns the value of the '<em><b>Krankenversichert Ueber Pflegeperson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Pflegekind ist über mich/uns krankenversichert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Krankenversichert Ueber Pflegeperson</em>' attribute.
	 * @see #setKrankenversichertUeberPflegeperson(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_KrankenversichertUeberPflegeperson()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='krankenversichertUeberPflegeperson' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKrankenversichertUeberPflegeperson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichertUeberPflegeperson <em>Krankenversichert Ueber Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krankenversichert Ueber Pflegeperson</em>' attribute.
	 * @see #getKrankenversichertUeberPflegeperson()
	 * @generated
	 */
	void setKrankenversichertUeberPflegeperson(String value);

	/**
	 * Returns the value of the '<em><b>Schule Ausbildungsstaette</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schule/Ausbildungsstätte
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schule Ausbildungsstaette</em>' attribute.
	 * @see #setSchuleAusbildungsstaette(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_SchuleAusbildungsstaette()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='schuleAusbildungsstaette' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSchuleAusbildungsstaette();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getSchuleAusbildungsstaette <em>Schule Ausbildungsstaette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schule Ausbildungsstaette</em>' attribute.
	 * @see #getSchuleAusbildungsstaette()
	 * @generated
	 */
	void setSchuleAusbildungsstaette(String value);

	/**
	 * Returns the value of the '<em><b>Klassenstufe Ausbildungsjahr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Klassenstufe/Ausbildungsjahr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Klassenstufe Ausbildungsjahr</em>' attribute.
	 * @see #setKlassenstufeAusbildungsjahr(BigInteger)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_KlassenstufeAusbildungsjahr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='klassenstufeAusbildungsjahr' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getKlassenstufeAusbildungsjahr();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKlassenstufeAusbildungsjahr <em>Klassenstufe Ausbildungsjahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klassenstufe Ausbildungsjahr</em>' attribute.
	 * @see #getKlassenstufeAusbildungsjahr()
	 * @generated
	 */
	void setKlassenstufeAusbildungsjahr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Einkommen Pflegekind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Einkommen des Pflegekindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommen Pflegekind</em>' containment reference.
	 * @see #setEinkommenPflegekind(EinkommenPflegekindType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenPflegekindType_EinkommenPflegekind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='einkommenPflegekind' namespace='##targetNamespace'"
	 * @generated
	 */
	EinkommenPflegekindType getEinkommenPflegekind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getEinkommenPflegekind <em>Einkommen Pflegekind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommen Pflegekind</em>' containment reference.
	 * @see #getEinkommenPflegekind()
	 * @generated
	 */
	void setEinkommenPflegekind(EinkommenPflegekindType value);

} // AngabenPflegekindType
