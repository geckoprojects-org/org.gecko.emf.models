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

import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zur Partnerschaft Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Partnerschaft
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerPartnerschaft <em>Dauer Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerGemeinsamerHaushalt <em>Dauer Gemeinsamer Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isVerheiratetOderLebenspartnerschaft <em>Verheiratet Oder Lebenspartnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerVerheiratetOderLebenspartnerschaft <em>Dauer Verheiratet Oder Lebenspartnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGespraechUeberAdoption <em>Gespraech Ueber Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getMeinungFamilieUndFreunde <em>Meinung Familie Und Freunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isMieteOderEigentum <em>Miete Oder Eigentum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGarten <em>Garten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isKinderzimmer <em>Kinderzimmer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isHaustiere <em>Haustiere</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType()
 * @model extendedMetaData="name='AngabenZurPartnerschaftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZurPartnerschaftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dauer Partnerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seit wann besteht Ihre Partnerschaft?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dauer Partnerschaft</em>' attribute.
	 * @see #setDauerPartnerschaft(BigInteger)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_DauerPartnerschaft()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='dauerPartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDauerPartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerPartnerschaft <em>Dauer Partnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer Partnerschaft</em>' attribute.
	 * @see #getDauerPartnerschaft()
	 * @generated
	 */
	void setDauerPartnerschaft(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dauer Gemeinsamer Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seit wann leben Sie in einem gemeinsamen Haushalt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dauer Gemeinsamer Haushalt</em>' attribute.
	 * @see #setDauerGemeinsamerHaushalt(BigInteger)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_DauerGemeinsamerHaushalt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='dauerGemeinsamerHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDauerGemeinsamerHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerGemeinsamerHaushalt <em>Dauer Gemeinsamer Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer Gemeinsamer Haushalt</em>' attribute.
	 * @see #getDauerGemeinsamerHaushalt()
	 * @generated
	 */
	void setDauerGemeinsamerHaushalt(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Verheiratet Oder Lebenspartnerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sind Sie verheiratet oder leben Sie in einer eingetragenen Lebenspartnerschaft?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verheiratet Oder Lebenspartnerschaft</em>' attribute.
	 * @see #isSetVerheiratetOderLebenspartnerschaft()
	 * @see #unsetVerheiratetOderLebenspartnerschaft()
	 * @see #setVerheiratetOderLebenspartnerschaft(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_VerheiratetOderLebenspartnerschaft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='verheiratetOderLebenspartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVerheiratetOderLebenspartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isVerheiratetOderLebenspartnerschaft <em>Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verheiratet Oder Lebenspartnerschaft</em>' attribute.
	 * @see #isSetVerheiratetOderLebenspartnerschaft()
	 * @see #unsetVerheiratetOderLebenspartnerschaft()
	 * @see #isVerheiratetOderLebenspartnerschaft()
	 * @generated
	 */
	void setVerheiratetOderLebenspartnerschaft(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isVerheiratetOderLebenspartnerschaft <em>Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerheiratetOderLebenspartnerschaft()
	 * @see #isVerheiratetOderLebenspartnerschaft()
	 * @see #setVerheiratetOderLebenspartnerschaft(boolean)
	 * @generated
	 */
	void unsetVerheiratetOderLebenspartnerschaft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isVerheiratetOderLebenspartnerschaft <em>Verheiratet Oder Lebenspartnerschaft</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verheiratet Oder Lebenspartnerschaft</em>' attribute is set.
	 * @see #unsetVerheiratetOderLebenspartnerschaft()
	 * @see #isVerheiratetOderLebenspartnerschaft()
	 * @see #setVerheiratetOderLebenspartnerschaft(boolean)
	 * @generated
	 */
	boolean isSetVerheiratetOderLebenspartnerschaft();

	/**
	 * Returns the value of the '<em><b>Dauer Verheiratet Oder Lebenspartnerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sind Sie verheiratet oder leben Sie in einer eingetragenen Lebenspartnerschaft? Wenn ja, seit wann?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dauer Verheiratet Oder Lebenspartnerschaft</em>' attribute.
	 * @see #setDauerVerheiratetOderLebenspartnerschaft(BigInteger)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_DauerVerheiratetOderLebenspartnerschaft()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='dauerVerheiratetOderLebenspartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDauerVerheiratetOderLebenspartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerVerheiratetOderLebenspartnerschaft <em>Dauer Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer Verheiratet Oder Lebenspartnerschaft</em>' attribute.
	 * @see #getDauerVerheiratetOderLebenspartnerschaft()
	 * @generated
	 */
	void setDauerVerheiratetOderLebenspartnerschaft(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Gespraech Ueber Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haben Sie mit den Kindern aus bestehender Ehe/Partnerschaft und früheren Ehen/Partnerschaften über die beabsichtigte Adoption gesprochen?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gespraech Ueber Adoption</em>' attribute.
	 * @see #isSetGespraechUeberAdoption()
	 * @see #unsetGespraechUeberAdoption()
	 * @see #setGespraechUeberAdoption(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_GespraechUeberAdoption()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='gespraechUeberAdoption' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGespraechUeberAdoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGespraechUeberAdoption <em>Gespraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gespraech Ueber Adoption</em>' attribute.
	 * @see #isSetGespraechUeberAdoption()
	 * @see #unsetGespraechUeberAdoption()
	 * @see #isGespraechUeberAdoption()
	 * @generated
	 */
	void setGespraechUeberAdoption(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGespraechUeberAdoption <em>Gespraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGespraechUeberAdoption()
	 * @see #isGespraechUeberAdoption()
	 * @see #setGespraechUeberAdoption(boolean)
	 * @generated
	 */
	void unsetGespraechUeberAdoption();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGespraechUeberAdoption <em>Gespraech Ueber Adoption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gespraech Ueber Adoption</em>' attribute is set.
	 * @see #unsetGespraechUeberAdoption()
	 * @see #isGespraechUeberAdoption()
	 * @see #setGespraechUeberAdoption(boolean)
	 * @generated
	 */
	boolean isSetGespraechUeberAdoption();

	/**
	 * Returns the value of the '<em><b>Meinung Familie Und Freunde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wie stehen Ihre Familien/Freunde zur beabsichtigten Adoption?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meinung Familie Und Freunde</em>' attribute.
	 * @see #setMeinungFamilieUndFreunde(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_MeinungFamilieUndFreunde()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='meinungFamilieUndFreunde' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMeinungFamilieUndFreunde();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getMeinungFamilieUndFreunde <em>Meinung Familie Und Freunde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meinung Familie Und Freunde</em>' attribute.
	 * @see #getMeinungFamilieUndFreunde()
	 * @generated
	 */
	void setMeinungFamilieUndFreunde(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Straße, Hausnummer, PLZ und Wohnort
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(MeldeanschriftType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	MeldeanschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(MeldeanschriftType value);

	/**
	 * Returns the value of the '<em><b>Wohnverhaeltnisse Anzahl Zimmer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl Zimmer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnverhaeltnisse Anzahl Zimmer</em>' attribute.
	 * @see #isSetWohnverhaeltnisseAnzahlZimmer()
	 * @see #unsetWohnverhaeltnisseAnzahlZimmer()
	 * @see #setWohnverhaeltnisseAnzahlZimmer(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_WohnverhaeltnisseAnzahlZimmer()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='wohnverhaeltnisseAnzahlZimmer' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWohnverhaeltnisseAnzahlZimmer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnverhaeltnisse Anzahl Zimmer</em>' attribute.
	 * @see #isSetWohnverhaeltnisseAnzahlZimmer()
	 * @see #unsetWohnverhaeltnisseAnzahlZimmer()
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @generated
	 */
	void setWohnverhaeltnisseAnzahlZimmer(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWohnverhaeltnisseAnzahlZimmer()
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @see #setWohnverhaeltnisseAnzahlZimmer(float)
	 * @generated
	 */
	void unsetWohnverhaeltnisseAnzahlZimmer();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wohnverhaeltnisse Anzahl Zimmer</em>' attribute is set.
	 * @see #unsetWohnverhaeltnisseAnzahlZimmer()
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @see #setWohnverhaeltnisseAnzahlZimmer(float)
	 * @generated
	 */
	boolean isSetWohnverhaeltnisseAnzahlZimmer();

	/**
	 * Returns the value of the '<em><b>Wohnverhaeltnisse Wohnflaeche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wohnfläche
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnverhaeltnisse Wohnflaeche</em>' attribute.
	 * @see #setWohnverhaeltnisseWohnflaeche(BigInteger)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_WohnverhaeltnisseWohnflaeche()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='wohnverhaeltnisseWohnflaeche' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWohnverhaeltnisseWohnflaeche();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnverhaeltnisse Wohnflaeche</em>' attribute.
	 * @see #getWohnverhaeltnisseWohnflaeche()
	 * @generated
	 */
	void setWohnverhaeltnisseWohnflaeche(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Miete Oder Eigentum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Handelt es sich um ein Mietverhältnis oder Wohneigentum?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Miete Oder Eigentum</em>' attribute.
	 * @see #isSetMieteOderEigentum()
	 * @see #unsetMieteOderEigentum()
	 * @see #setMieteOderEigentum(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_MieteOderEigentum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='mieteOderEigentum' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMieteOderEigentum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isMieteOderEigentum <em>Miete Oder Eigentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miete Oder Eigentum</em>' attribute.
	 * @see #isSetMieteOderEigentum()
	 * @see #unsetMieteOderEigentum()
	 * @see #isMieteOderEigentum()
	 * @generated
	 */
	void setMieteOderEigentum(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isMieteOderEigentum <em>Miete Oder Eigentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMieteOderEigentum()
	 * @see #isMieteOderEigentum()
	 * @see #setMieteOderEigentum(boolean)
	 * @generated
	 */
	void unsetMieteOderEigentum();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isMieteOderEigentum <em>Miete Oder Eigentum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Miete Oder Eigentum</em>' attribute is set.
	 * @see #unsetMieteOderEigentum()
	 * @see #isMieteOderEigentum()
	 * @see #setMieteOderEigentum(boolean)
	 * @generated
	 */
	boolean isSetMieteOderEigentum();

	/**
	 * Returns the value of the '<em><b>Garten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ist ein Garten vorhanden?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Garten</em>' attribute.
	 * @see #isSetGarten()
	 * @see #unsetGarten()
	 * @see #setGarten(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_Garten()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='garten' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGarten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGarten <em>Garten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Garten</em>' attribute.
	 * @see #isSetGarten()
	 * @see #unsetGarten()
	 * @see #isGarten()
	 * @generated
	 */
	void setGarten(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGarten <em>Garten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGarten()
	 * @see #isGarten()
	 * @see #setGarten(boolean)
	 * @generated
	 */
	void unsetGarten();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGarten <em>Garten</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Garten</em>' attribute is set.
	 * @see #unsetGarten()
	 * @see #isGarten()
	 * @see #setGarten(boolean)
	 * @generated
	 */
	boolean isSetGarten();

	/**
	 * Returns the value of the '<em><b>Kinderzimmer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steht ein eigenes Kinderzimmer für das zu adoptierende Kind zur Verfügung?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinderzimmer</em>' attribute.
	 * @see #isSetKinderzimmer()
	 * @see #unsetKinderzimmer()
	 * @see #setKinderzimmer(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_Kinderzimmer()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kinderzimmer' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKinderzimmer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isKinderzimmer <em>Kinderzimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinderzimmer</em>' attribute.
	 * @see #isSetKinderzimmer()
	 * @see #unsetKinderzimmer()
	 * @see #isKinderzimmer()
	 * @generated
	 */
	void setKinderzimmer(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isKinderzimmer <em>Kinderzimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKinderzimmer()
	 * @see #isKinderzimmer()
	 * @see #setKinderzimmer(boolean)
	 * @generated
	 */
	void unsetKinderzimmer();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isKinderzimmer <em>Kinderzimmer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kinderzimmer</em>' attribute is set.
	 * @see #unsetKinderzimmer()
	 * @see #isKinderzimmer()
	 * @see #setKinderzimmer(boolean)
	 * @generated
	 */
	boolean isSetKinderzimmer();

	/**
	 * Returns the value of the '<em><b>Haustiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haben Sie Haustiere?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Haustiere</em>' attribute.
	 * @see #isSetHaustiere()
	 * @see #unsetHaustiere()
	 * @see #setHaustiere(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenZurPartnerschaftType_Haustiere()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='haustiere' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHaustiere();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isHaustiere <em>Haustiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haustiere</em>' attribute.
	 * @see #isSetHaustiere()
	 * @see #unsetHaustiere()
	 * @see #isHaustiere()
	 * @generated
	 */
	void setHaustiere(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isHaustiere <em>Haustiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHaustiere()
	 * @see #isHaustiere()
	 * @see #setHaustiere(boolean)
	 * @generated
	 */
	void unsetHaustiere();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isHaustiere <em>Haustiere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Haustiere</em>' attribute is set.
	 * @see #unsetHaustiere()
	 * @see #isHaustiere()
	 * @see #setHaustiere(boolean)
	 * @generated
	 */
	boolean isSetHaustiere();

} // AngabenZurPartnerschaftType
