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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterhalt Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Unterhalt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltstitel <em>Unterhaltstitel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltzahlungen <em>Unterhaltzahlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltvorauszahlungen <em>Unterhaltvorauszahlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getBemuehungen <em>Bemuehungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getWeitereAngaben <em>Weitere Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltBasisType()
 * @model extendedMetaData="name='Unterhalt.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unterhaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Unterhaltstitel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltstitel</em>' containment reference.
	 * @see #setUnterhaltstitel(UnterhaltstitelType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltBasisType_Unterhaltstitel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unterhaltstitel' namespace='##targetNamespace'"
	 * @generated
	 */
	UnterhaltstitelType getUnterhaltstitel();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltstitel <em>Unterhaltstitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhaltstitel</em>' containment reference.
	 * @see #getUnterhaltstitel()
	 * @generated
	 */
	void setUnterhaltstitel(UnterhaltstitelType value);

	/**
	 * Returns the value of the '<em><b>Unterhaltzahlungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu bisherigen Unterhaltszahlungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltzahlungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltBasisType_Unterhaltzahlungen()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='unterhaltzahlungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnterhaltszahlungenType> getUnterhaltzahlungen();

	/**
	 * Returns the value of the '<em><b>Unterhaltvorauszahlungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu Vorauszahlungen des Unterhalts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltvorauszahlungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltBasisType_Unterhaltvorauszahlungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unterhaltvorauszahlungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnterhaltsvorauszahlungenType> getUnterhaltvorauszahlungen();

	/**
	 * Returns the value of the '<em><b>Bemuehungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu den Bemühungen durch die antragstellende Person den Unterhalt zu erhalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemuehungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltBasisType_Bemuehungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bemuehungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BemuehungenUnterhaltType> getBemuehungen();

	/**
	 * Returns the value of the '<em><b>Weitere Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Angaben zum Unterhalt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Angaben</em>' attribute.
	 * @see #setWeitereAngaben(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltBasisType_WeitereAngaben()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='weitereAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWeitereAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getWeitereAngaben <em>Weitere Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Angaben</em>' attribute.
	 * @see #getWeitereAngaben()
	 * @generated
	 */
	void setWeitereAngaben(String value);

} // UnterhaltBasisType
