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
 * A representation of the model object '<em><b>Tatsache Mit Freitext Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allgemeiner Datentyp zur Angabe des Zutreffens eines Sachverhaltes ggf. ergänzt durch weitere Angaben in einem Freitextfeld
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#isLiegtVor <em>Liegt Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#getFreitext <em>Freitext</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitFreitextType()
 * @model extendedMetaData="name='TatsacheMitFreitextType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TatsacheMitFreitextType extends EObject {
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
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitFreitextType_LiegtVor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='liegtVor' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLiegtVor();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#isLiegtVor <em>Liegt Vor</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#isLiegtVor <em>Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiegtVor()
	 * @see #isLiegtVor()
	 * @see #setLiegtVor(boolean)
	 * @generated
	 */
	void unsetLiegtVor();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#isLiegtVor <em>Liegt Vor</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Freitext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Sachverhalt, der eingetreten ist, kann hier näher beschrieben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freitext</em>' attribute.
	 * @see #setFreitext(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTatsacheMitFreitextType_Freitext()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='freitext' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFreitext();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#getFreitext <em>Freitext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freitext</em>' attribute.
	 * @see #getFreitext()
	 * @generated
	 */
	void setFreitext(String value);

} // TatsacheMitFreitextType
