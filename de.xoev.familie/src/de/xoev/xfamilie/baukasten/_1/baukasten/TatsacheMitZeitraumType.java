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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tatsache Mit Zeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allgemeiner Datentyp zur Angabe des Zutreffens eines Sachverhaltes ggf. um ergänzt den Zeitraum ab und/oder bis wann dieser zutreffend ist/war.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#isLiegtVor <em>Liegt Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#getZeitraum <em>Zeitraum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitZeitraumType()
 * @model extendedMetaData="name='TatsacheMitZeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TatsacheMitZeitraumType extends EObject {
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
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitZeitraumType_LiegtVor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='liegtVor' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLiegtVor();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#isLiegtVor <em>Liegt Vor</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#isLiegtVor <em>Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiegtVor()
	 * @see #isLiegtVor()
	 * @see #setLiegtVor(boolean)
	 * @generated
	 */
	void unsetLiegtVor();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#isLiegtVor <em>Liegt Vor</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Tag, an dem der Sachverhalt eingetreten ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference.
	 * @see #setZeitraum(ZeitraumType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitZeitraumType_Zeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#getZeitraum <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' containment reference.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(ZeitraumType value);

} // TatsacheMitZeitraumType
