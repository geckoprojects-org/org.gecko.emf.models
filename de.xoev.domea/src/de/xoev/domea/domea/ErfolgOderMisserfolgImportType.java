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
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erfolg Oder Misserfolg Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Information zum erfolgreichen oder nicht erfolgreichen Import eines Schriftgutobjektes oder einer Nachricht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#isErfolgreich <em>Erfolgreich</em>}</li>
 *   <li>{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#getFehlermeldung <em>Fehlermeldung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#getFehlermeldungCode <em>Fehlermeldung Code</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getErfolgOderMisserfolgImportType()
 * @model extendedMetaData="name='ErfolgOderMisserfolgImportType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ErfolgOderMisserfolgImportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Erfolgreich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kennzeichnung des erfolgreichen oder nicht erfolgreichen Imports zu einem Schriftgutobjekt oder einer Nachricht. Der erfolgreiche Import wird mit "1" und der nicht erfolgreiche Import mit "0" gekennzeichnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erfolgreich</em>' attribute.
	 * @see #isSetErfolgreich()
	 * @see #unsetErfolgreich()
	 * @see #setErfolgreich(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getErfolgOderMisserfolgImportType_Erfolgreich()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Erfolgreich' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isErfolgreich();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#isErfolgreich <em>Erfolgreich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erfolgreich</em>' attribute.
	 * @see #isSetErfolgreich()
	 * @see #unsetErfolgreich()
	 * @see #isErfolgreich()
	 * @generated
	 */
	void setErfolgreich(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#isErfolgreich <em>Erfolgreich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErfolgreich()
	 * @see #isErfolgreich()
	 * @see #setErfolgreich(boolean)
	 * @generated
	 */
	void unsetErfolgreich();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#isErfolgreich <em>Erfolgreich</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Erfolgreich</em>' attribute is set.
	 * @see #unsetErfolgreich()
	 * @see #isErfolgreich()
	 * @see #setErfolgreich(boolean)
	 * @generated
	 */
	boolean isSetErfolgreich();

	/**
	 * Returns the value of the '<em><b>Fehlermeldung</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Information in Form eines Freitextes, aus welchem Grund der Import zum Schriftgutobjekt oder zur Nachricht nicht erfolgreich war.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fehlermeldung</em>' attribute list.
	 * @see de.xoev.domea.domea.DomeaPackage#getErfolgOderMisserfolgImportType_Fehlermeldung()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Fehlermeldung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFehlermeldung();

	/**
	 * Returns the value of the '<em><b>Fehlermeldung Code</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.SonstigeFehlermeldungCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Information in Form eines Codes, aus welchem Grund der Import zum Schriftgutobjekt oder zur Nachricht nicht erfolgreich war.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fehlermeldung Code</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getErfolgOderMisserfolgImportType_FehlermeldungCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FehlermeldungCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SonstigeFehlermeldungCodeType> getFehlermeldungCode();

} // ErfolgOderMisserfolgImportType
