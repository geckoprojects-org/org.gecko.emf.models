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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tatsache Mit Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allgemeiner Datentyp zur Angabe des Zutreffens eines Sachverhaltes ggf. ergänzt um Nachweis bzw. um UUID zur korrekten nachweisnachricht
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#isLiegtVor <em>Liegt Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitNachweisType()
 * @model extendedMetaData="name='TatsacheMitNachweisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TatsacheMitNachweisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob ein bestimmter Sachverhalt eingetreten ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Liegt Vor</em>' attribute.
	 * @see #isSetLiegtVor()
	 * @see #unsetLiegtVor()
	 * @see #setLiegtVor(boolean)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitNachweisType_LiegtVor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='liegtVor' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLiegtVor();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#isLiegtVor <em>Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liegt Vor</em>' attribute.
	 * @see #isSetLiegtVor()
	 * @see #unsetLiegtVor()
	 * @see #isLiegtVor()
	 * @generated
	 */
	void setLiegtVor(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#isLiegtVor <em>Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiegtVor()
	 * @see #isLiegtVor()
	 * @see #setLiegtVor(boolean)
	 * @generated
	 */
	void unsetLiegtVor();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#isLiegtVor <em>Liegt Vor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Liegt Vor</em>' attribute is set.
	 * @see #unsetLiegtVor()
	 * @see #isLiegtVor()
	 * @see #setLiegtVor(boolean)
	 * @generated
	 */
	boolean isSetLiegtVor();

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitNachweisType_Nachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNachweis();

} // TatsacheMitNachweisType
