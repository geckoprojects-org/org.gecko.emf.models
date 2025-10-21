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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkommen Und Wohnen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu Einkommen und Wohnen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType()
 * @model extendedMetaData="name='EinkommenUndWohnenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkommenUndWohnenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einkünfte aus Tätigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte Aus Taetigkeit</em>' attribute.
	 * @see #isSetEinkuenfteAusTaetigkeit()
	 * @see #unsetEinkuenfteAusTaetigkeit()
	 * @see #setEinkuenfteAusTaetigkeit(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_EinkuenfteAusTaetigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='einkuenfteAusTaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	float getEinkuenfteAusTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkuenfte Aus Taetigkeit</em>' attribute.
	 * @see #isSetEinkuenfteAusTaetigkeit()
	 * @see #unsetEinkuenfteAusTaetigkeit()
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @generated
	 */
	void setEinkuenfteAusTaetigkeit(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkuenfteAusTaetigkeit()
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @see #setEinkuenfteAusTaetigkeit(float)
	 * @generated
	 */
	void unsetEinkuenfteAusTaetigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkuenfte Aus Taetigkeit</em>' attribute is set.
	 * @see #unsetEinkuenfteAusTaetigkeit()
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @see #setEinkuenfteAusTaetigkeit(float)
	 * @generated
	 */
	boolean isSetEinkuenfteAusTaetigkeit();

	/**
	 * Returns the value of the '<em><b>Andere Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe von anderen Einkünften
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Andere Einkuenfte</em>' attribute.
	 * @see #isSetAndereEinkuenfte()
	 * @see #unsetAndereEinkuenfte()
	 * @see #setAndereEinkuenfte(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_AndereEinkuenfte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='andereEinkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	float getAndereEinkuenfte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Andere Einkuenfte</em>' attribute.
	 * @see #isSetAndereEinkuenfte()
	 * @see #unsetAndereEinkuenfte()
	 * @see #getAndereEinkuenfte()
	 * @generated
	 */
	void setAndereEinkuenfte(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAndereEinkuenfte()
	 * @see #getAndereEinkuenfte()
	 * @see #setAndereEinkuenfte(float)
	 * @generated
	 */
	void unsetAndereEinkuenfte();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Andere Einkuenfte</em>' attribute is set.
	 * @see #unsetAndereEinkuenfte()
	 * @see #getAndereEinkuenfte()
	 * @see #setAndereEinkuenfte(float)
	 * @generated
	 */
	boolean isSetAndereEinkuenfte();

	/**
	 * Returns the value of the '<em><b>Schuldverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schuldverpflichtungen (z.B. Kredite).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schuldverpflichtungen</em>' attribute.
	 * @see #isSetSchuldverpflichtungen()
	 * @see #unsetSchuldverpflichtungen()
	 * @see #setSchuldverpflichtungen(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_Schuldverpflichtungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='schuldverpflichtungen' namespace='##targetNamespace'"
	 * @generated
	 */
	float getSchuldverpflichtungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schuldverpflichtungen</em>' attribute.
	 * @see #isSetSchuldverpflichtungen()
	 * @see #unsetSchuldverpflichtungen()
	 * @see #getSchuldverpflichtungen()
	 * @generated
	 */
	void setSchuldverpflichtungen(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchuldverpflichtungen()
	 * @see #getSchuldverpflichtungen()
	 * @see #setSchuldverpflichtungen(float)
	 * @generated
	 */
	void unsetSchuldverpflichtungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schuldverpflichtungen</em>' attribute is set.
	 * @see #unsetSchuldverpflichtungen()
	 * @see #getSchuldverpflichtungen()
	 * @see #setSchuldverpflichtungen(float)
	 * @generated
	 */
	boolean isSetSchuldverpflichtungen();

	/**
	 * Returns the value of the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterhaltsverpflichtungen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltsverpflichtungen</em>' attribute.
	 * @see #isSetUnterhaltsverpflichtungen()
	 * @see #unsetUnterhaltsverpflichtungen()
	 * @see #setUnterhaltsverpflichtungen(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_Unterhaltsverpflichtungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='unterhaltsverpflichtungen' namespace='##targetNamespace'"
	 * @generated
	 */
	float getUnterhaltsverpflichtungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhaltsverpflichtungen</em>' attribute.
	 * @see #isSetUnterhaltsverpflichtungen()
	 * @see #unsetUnterhaltsverpflichtungen()
	 * @see #getUnterhaltsverpflichtungen()
	 * @generated
	 */
	void setUnterhaltsverpflichtungen(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnterhaltsverpflichtungen()
	 * @see #getUnterhaltsverpflichtungen()
	 * @see #setUnterhaltsverpflichtungen(float)
	 * @generated
	 */
	void unsetUnterhaltsverpflichtungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unterhaltsverpflichtungen</em>' attribute is set.
	 * @see #unsetUnterhaltsverpflichtungen()
	 * @see #getUnterhaltsverpflichtungen()
	 * @see #setUnterhaltsverpflichtungen(float)
	 * @generated
	 */
	boolean isSetUnterhaltsverpflichtungen();

	/**
	 * Returns the value of the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monatliche Fixkosten für Unterkunft
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monatliche Fixkosten Unterkunft</em>' attribute.
	 * @see #isSetMonatlicheFixkostenUnterkunft()
	 * @see #unsetMonatlicheFixkostenUnterkunft()
	 * @see #setMonatlicheFixkostenUnterkunft(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_MonatlicheFixkostenUnterkunft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='monatlicheFixkostenUnterkunft' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMonatlicheFixkostenUnterkunft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monatliche Fixkosten Unterkunft</em>' attribute.
	 * @see #isSetMonatlicheFixkostenUnterkunft()
	 * @see #unsetMonatlicheFixkostenUnterkunft()
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @generated
	 */
	void setMonatlicheFixkostenUnterkunft(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonatlicheFixkostenUnterkunft()
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @see #setMonatlicheFixkostenUnterkunft(float)
	 * @generated
	 */
	void unsetMonatlicheFixkostenUnterkunft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monatliche Fixkosten Unterkunft</em>' attribute is set.
	 * @see #unsetMonatlicheFixkostenUnterkunft()
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @see #setMonatlicheFixkostenUnterkunft(float)
	 * @generated
	 */
	boolean isSetMonatlicheFixkostenUnterkunft();

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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_WohnverhaeltnisseAnzahlZimmer()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='wohnverhaeltnisseAnzahlZimmer' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWohnverhaeltnisseAnzahlZimmer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWohnverhaeltnisseAnzahlZimmer()
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @see #setWohnverhaeltnisseAnzahlZimmer(float)
	 * @generated
	 */
	void unsetWohnverhaeltnisseAnzahlZimmer();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenUndWohnenType_WohnverhaeltnisseWohnflaeche()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='wohnverhaeltnisseWohnflaeche' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWohnverhaeltnisseWohnflaeche();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnverhaeltnisse Wohnflaeche</em>' attribute.
	 * @see #getWohnverhaeltnisseWohnflaeche()
	 * @generated
	 */
	void setWohnverhaeltnisseWohnflaeche(BigInteger value);

} // EinkommenUndWohnenType
