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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verbleibender Sorgeberechtigter Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum verbleibenden/sorgeberechtigten Elternteil
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeschlecht <em>Geschlecht</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType()
 * @model extendedMetaData="name='VerbleibenderSorgeberechtigterElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VerbleibenderSorgeberechtigterElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Personendaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getPersonendaten <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personendaten</em>' containment reference.
	 * @see #getPersonendaten()
	 * @generated
	 */
	void setPersonendaten(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Staatsangehörigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Geburtsdatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtOptionalType value);

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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_EinkuenfteAusTaetigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='einkuenfteAusTaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	float getEinkuenfteAusTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkuenfteAusTaetigkeit()
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @see #setEinkuenfteAusTaetigkeit(float)
	 * @generated
	 */
	void unsetEinkuenfteAusTaetigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_AndereEinkuenfte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='andereEinkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	float getAndereEinkuenfte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAndereEinkuenfte()
	 * @see #getAndereEinkuenfte()
	 * @see #setAndereEinkuenfte(float)
	 * @generated
	 */
	void unsetAndereEinkuenfte();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}' attribute is set.
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
	 * Schuldverpflichtungen (z.B. Kredite)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schuldverpflichtungen</em>' attribute.
	 * @see #isSetSchuldverpflichtungen()
	 * @see #unsetSchuldverpflichtungen()
	 * @see #setSchuldverpflichtungen(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Schuldverpflichtungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='schuldverpflichtungen' namespace='##targetNamespace'"
	 * @generated
	 */
	float getSchuldverpflichtungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchuldverpflichtungen()
	 * @see #getSchuldverpflichtungen()
	 * @see #setSchuldverpflichtungen(float)
	 * @generated
	 */
	void unsetSchuldverpflichtungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Unterhaltsverpflichtungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='unterhaltsverpflichtungen' namespace='##targetNamespace'"
	 * @generated
	 */
	float getUnterhaltsverpflichtungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnterhaltsverpflichtungen()
	 * @see #getUnterhaltsverpflichtungen()
	 * @see #setUnterhaltsverpflichtungen(float)
	 * @generated
	 */
	void unsetUnterhaltsverpflichtungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}' attribute is set.
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
	 * Monatliche Fixkosten für Unterkunft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monatliche Fixkosten Unterkunft</em>' attribute.
	 * @see #isSetMonatlicheFixkostenUnterkunft()
	 * @see #unsetMonatlicheFixkostenUnterkunft()
	 * @see #setMonatlicheFixkostenUnterkunft(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_MonatlicheFixkostenUnterkunft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='monatlicheFixkostenUnterkunft' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMonatlicheFixkostenUnterkunft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonatlicheFixkostenUnterkunft()
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @see #setMonatlicheFixkostenUnterkunft(float)
	 * @generated
	 */
	void unsetMonatlicheFixkostenUnterkunft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein unsicherer Aufenthaltsstatus der Bewerbenden kann ein Indiz für sachfremde Motive für die gewünschte Adoption sein. Daher ist eine Abfrage erforderlich. Rechtsgrundlage: §§ 68 I Nr. 12, 60 ff. SGB I, §§ 7 I, II, 7e S. 1 Nr. 1, 9e AdVermiG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltsstatus</em>' containment reference.
	 * @see #setAufenthaltsstatus(CodeAufenthaltsstatusType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Aufenthaltsstatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aufenthaltsstatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAufenthaltsstatusType getAufenthaltsstatus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltsstatus</em>' containment reference.
	 * @see #getAufenthaltsstatus()
	 * @generated
	 */
	void setAufenthaltsstatus(CodeAufenthaltsstatusType value);

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Bewerbungen von gleichgeschlechtlichen Paaren ergeben sich spezifische Themen, die in den Beratungsgespräche miteinbezogen werden müssen. Rechtsgrundlage: §§ 68 I Nr. 12, 60 ff. SGB I, §§ 7 I, II, 7e S. 1 Nr. 1, 9e AdVermiG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschlecht</em>' containment reference.
	 * @see #setGeschlecht(CodeGeschlechtType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getVerbleibenderSorgeberechtigterElternteilType_Geschlecht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geschlecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGeschlechtType getGeschlecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeschlecht <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' containment reference.
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(CodeGeschlechtType value);

} // VerbleibenderSorgeberechtigterElternteilType
