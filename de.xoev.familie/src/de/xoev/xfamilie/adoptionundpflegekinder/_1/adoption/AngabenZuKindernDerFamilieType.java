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
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zu Kindern Der Familie Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu Kindern in der Familie
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getVerhaeltnisKind <em>Verhaeltnis Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getElternteilDesKindes <em>Elternteil Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#isKindWohnhaftHaushalt <em>Kind Wohnhaft Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindWohnhaftAlterntive <em>Kind Wohnhaft Alterntive</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindVerstorben <em>Kind Verstorben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType()
 * @model extendedMetaData="name='AngabenZuKindernDerFamilieType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZuKindernDerFamilieType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_Personendaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getPersonendaten <em>Personendaten</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtOptionalType value);

	/**
	 * Returns the value of the '<em><b>Verhaeltnis Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verhältnis zu dem Kind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verhaeltnis Kind</em>' attribute.
	 * @see #setVerhaeltnisKind(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_VerhaeltnisKind()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='verhaeltnisKind' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVerhaeltnisKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getVerhaeltnisKind <em>Verhaeltnis Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verhaeltnis Kind</em>' attribute.
	 * @see #getVerhaeltnisKind()
	 * @generated
	 */
	void setVerhaeltnisKind(String value);

	/**
	 * Returns the value of the '<em><b>Elternteil Des Kindes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wer ist Elternteil von dem Kind?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elternteil Des Kindes</em>' attribute.
	 * @see #setElternteilDesKindes(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_ElternteilDesKindes()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='elternteilDesKindes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElternteilDesKindes();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getElternteilDesKindes <em>Elternteil Des Kindes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternteil Des Kindes</em>' attribute.
	 * @see #getElternteilDesKindes()
	 * @generated
	 */
	void setElternteilDesKindes(String value);

	/**
	 * Returns the value of the '<em><b>Kind Wohnhaft Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lebt das Kind im Haushalt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind Wohnhaft Haushalt</em>' attribute.
	 * @see #isSetKindWohnhaftHaushalt()
	 * @see #unsetKindWohnhaftHaushalt()
	 * @see #setKindWohnhaftHaushalt(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_KindWohnhaftHaushalt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kindWohnhaftHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKindWohnhaftHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#isKindWohnhaftHaushalt <em>Kind Wohnhaft Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Wohnhaft Haushalt</em>' attribute.
	 * @see #isSetKindWohnhaftHaushalt()
	 * @see #unsetKindWohnhaftHaushalt()
	 * @see #isKindWohnhaftHaushalt()
	 * @generated
	 */
	void setKindWohnhaftHaushalt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#isKindWohnhaftHaushalt <em>Kind Wohnhaft Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKindWohnhaftHaushalt()
	 * @see #isKindWohnhaftHaushalt()
	 * @see #setKindWohnhaftHaushalt(boolean)
	 * @generated
	 */
	void unsetKindWohnhaftHaushalt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#isKindWohnhaftHaushalt <em>Kind Wohnhaft Haushalt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind Wohnhaft Haushalt</em>' attribute is set.
	 * @see #unsetKindWohnhaftHaushalt()
	 * @see #isKindWohnhaftHaushalt()
	 * @see #setKindWohnhaftHaushalt(boolean)
	 * @generated
	 */
	boolean isSetKindWohnhaftHaushalt();

	/**
	 * Returns the value of the '<em><b>Kind Wohnhaft Alterntive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lebt das Kind im Haushalt? Wenn nein, wo lebt das Kind?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind Wohnhaft Alterntive</em>' attribute.
	 * @see #setKindWohnhaftAlterntive(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_KindWohnhaftAlterntive()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='kindWohnhaftAlterntive' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKindWohnhaftAlterntive();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindWohnhaftAlterntive <em>Kind Wohnhaft Alterntive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Wohnhaft Alterntive</em>' attribute.
	 * @see #getKindWohnhaftAlterntive()
	 * @generated
	 */
	void setKindWohnhaftAlterntive(String value);

	/**
	 * Returns the value of the '<em><b>Kind Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls verstorben, bitte Sterbedatum eintragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind Verstorben</em>' containment reference.
	 * @see #setKindVerstorben(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZuKindernDerFamilieType_KindVerstorben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kindVerstorben' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getKindVerstorben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindVerstorben <em>Kind Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Verstorben</em>' containment reference.
	 * @see #getKindVerstorben()
	 * @generated
	 */
	void setKindVerstorben(TeilbekanntesDatumType value);

} // AngabenZuKindernDerFamilieType
