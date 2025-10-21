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

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterhaltstitel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Unterhaltstitel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getLiegtMirVor <em>Liegt Mir Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiAnderePerson <em>Titel Bei Andere Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiInstitution <em>Titel Bei Institution</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getAntragUnterhaltsfestsetzungGestellt <em>Antrag Unterhaltsfestsetzung Gestellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichGerichtlich <em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichAussergerichtlich <em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#isEsGibtEinenUnterhaltstitel <em>Es Gibt Einen Unterhaltstitel</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType()
 * @model extendedMetaData="name='UnterhaltstitelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltstitelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Liegt Mir Vor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob der antragstellenden Person der Titel vorliegt. Regel: Falls "esGibtEinenUnterhaltstitel" True ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Liegt Mir Vor</em>' containment reference.
	 * @see #setLiegtMirVor(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_LiegtMirVor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='liegtMirVor' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getLiegtMirVor();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getLiegtMirVor <em>Liegt Mir Vor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liegt Mir Vor</em>' containment reference.
	 * @see #getLiegtMirVor()
	 * @generated
	 */
	void setLiegtMirVor(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Titel Bei Andere Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur anderen Person, bei der der Unterhaltstitel liegt. Regel: Falls "esGibtEinenUnterhaltstitel" True ist und "liegtMirVor" False und "titelBeiInstitution" False ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titel Bei Andere Person</em>' containment reference.
	 * @see #setTitelBeiAnderePerson(AnderePersonType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_TitelBeiAnderePerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='titelBeiAnderePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	AnderePersonType getTitelBeiAnderePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiAnderePerson <em>Titel Bei Andere Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titel Bei Andere Person</em>' containment reference.
	 * @see #getTitelBeiAnderePerson()
	 * @generated
	 */
	void setTitelBeiAnderePerson(AnderePersonType value);

	/**
	 * Returns the value of the '<em><b>Titel Bei Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Institution, bei der der Unterhaltstitel liegt. Regel: Falls "esGibtEinenUnterhaltstitel" True ist und "liegtMirVor" False und "titelBeiAnderePerson" False ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titel Bei Institution</em>' containment reference.
	 * @see #setTitelBeiInstitution(InstitutionUnterhaltstitelType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_TitelBeiInstitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='titelBeiInstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	InstitutionUnterhaltstitelType getTitelBeiInstitution();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiInstitution <em>Titel Bei Institution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titel Bei Institution</em>' containment reference.
	 * @see #getTitelBeiInstitution()
	 * @generated
	 */
	void setTitelBeiInstitution(InstitutionUnterhaltstitelType value);

	/**
	 * Returns the value of the '<em><b>Antrag Unterhaltsfestsetzung Gestellt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur Unterhaltsfestsetzung. Regel: Falls "esGibtEinenUnterhaltstitel" False ist, kann dieses Datum ausgefüllt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antrag Unterhaltsfestsetzung Gestellt</em>' containment reference.
	 * @see #setAntragUnterhaltsfestsetzungGestellt(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_AntragUnterhaltsfestsetzungGestellt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='antragUnterhaltsfestsetzungGestellt' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getAntragUnterhaltsfestsetzungGestellt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getAntragUnterhaltsfestsetzungGestellt <em>Antrag Unterhaltsfestsetzung Gestellt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag Unterhaltsfestsetzung Gestellt</em>' containment reference.
	 * @see #getAntragUnterhaltsfestsetzungGestellt()
	 * @generated
	 */
	void setAntragUnterhaltsfestsetzungGestellt(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Befreiung Unterhalt Durch Vergleich Gerichtlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Befreiung vom Unterhalt. Regel: Falls "esGibtEinenUnterhaltstitel" False ist, kann dieses Datum ausgefüllt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>' containment reference.
	 * @see #setBefreiungUnterhaltDurchVergleichGerichtlich(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_BefreiungUnterhaltDurchVergleichGerichtlich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='befreiungUnterhaltDurchVergleichGerichtlich' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getBefreiungUnterhaltDurchVergleichGerichtlich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichGerichtlich <em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>' containment reference.
	 * @see #getBefreiungUnterhaltDurchVergleichGerichtlich()
	 * @generated
	 */
	void setBefreiungUnterhaltDurchVergleichGerichtlich(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Befreiung vom Unterhalt. Regel: Falls "esGibtEinenUnterhaltstitel" False ist, kann dieses Datum ausgefüllt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>' containment reference.
	 * @see #setBefreiungUnterhaltDurchVergleichAussergerichtlich(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_BefreiungUnterhaltDurchVergleichAussergerichtlich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='befreiungUnterhaltDurchVergleichAussergerichtlich' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getBefreiungUnterhaltDurchVergleichAussergerichtlich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichAussergerichtlich <em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>' containment reference.
	 * @see #getBefreiungUnterhaltDurchVergleichAussergerichtlich()
	 * @generated
	 */
	void setBefreiungUnterhaltDurchVergleichAussergerichtlich(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Es Gibt Einen Unterhaltstitel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob ein Unterhaltstitel vorliegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Es Gibt Einen Unterhaltstitel</em>' attribute.
	 * @see #isSetEsGibtEinenUnterhaltstitel()
	 * @see #unsetEsGibtEinenUnterhaltstitel()
	 * @see #setEsGibtEinenUnterhaltstitel(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltstitelType_EsGibtEinenUnterhaltstitel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='esGibtEinenUnterhaltstitel' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEsGibtEinenUnterhaltstitel();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#isEsGibtEinenUnterhaltstitel <em>Es Gibt Einen Unterhaltstitel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Gibt Einen Unterhaltstitel</em>' attribute.
	 * @see #isSetEsGibtEinenUnterhaltstitel()
	 * @see #unsetEsGibtEinenUnterhaltstitel()
	 * @see #isEsGibtEinenUnterhaltstitel()
	 * @generated
	 */
	void setEsGibtEinenUnterhaltstitel(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#isEsGibtEinenUnterhaltstitel <em>Es Gibt Einen Unterhaltstitel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEsGibtEinenUnterhaltstitel()
	 * @see #isEsGibtEinenUnterhaltstitel()
	 * @see #setEsGibtEinenUnterhaltstitel(boolean)
	 * @generated
	 */
	void unsetEsGibtEinenUnterhaltstitel();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#isEsGibtEinenUnterhaltstitel <em>Es Gibt Einen Unterhaltstitel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Es Gibt Einen Unterhaltstitel</em>' attribute is set.
	 * @see #unsetEsGibtEinenUnterhaltstitel()
	 * @see #isEsGibtEinenUnterhaltstitel()
	 * @see #setEsGibtEinenUnterhaltstitel(boolean)
	 * @generated
	 */
	boolean isSetEsGibtEinenUnterhaltstitel();

} // UnterhaltstitelType
