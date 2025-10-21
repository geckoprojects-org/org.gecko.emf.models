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
 * A representation of the model object '<em><b>Postkorb Handle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enthält die Elemente PostkorbHandle als String sowie einen Boolean, der die Zustimmung der Antragsteller:in zum elektronischen Bescheidversand abbildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#getPostkorbHandle <em>Postkorb Handle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#isZustimmungElektronischerBescheid <em>Zustimmung Elektronischer Bescheid</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostkorbHandleType()
 * @model extendedMetaData="name='PostkorbHandleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PostkorbHandleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Postkorb Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postkorb-Handle für die elektronische Bescheidzustellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postkorb Handle</em>' attribute.
	 * @see #setPostkorbHandle(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostkorbHandleType_PostkorbHandle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='postkorbHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostkorbHandle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#getPostkorbHandle <em>Postkorb Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postkorb Handle</em>' attribute.
	 * @see #getPostkorbHandle()
	 * @generated
	 */
	void setPostkorbHandle(String value);

	/**
	 * Returns the value of the '<em><b>Zustimmung Elektronischer Bescheid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean, der die Zustimmung der Antragsteller:in zum elektronischen Bescheidversand abbildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung Elektronischer Bescheid</em>' attribute.
	 * @see #isSetZustimmungElektronischerBescheid()
	 * @see #unsetZustimmungElektronischerBescheid()
	 * @see #setZustimmungElektronischerBescheid(boolean)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostkorbHandleType_ZustimmungElektronischerBescheid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zustimmungElektronischerBescheid' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungElektronischerBescheid();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#isZustimmungElektronischerBescheid <em>Zustimmung Elektronischer Bescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Elektronischer Bescheid</em>' attribute.
	 * @see #isSetZustimmungElektronischerBescheid()
	 * @see #unsetZustimmungElektronischerBescheid()
	 * @see #isZustimmungElektronischerBescheid()
	 * @generated
	 */
	void setZustimmungElektronischerBescheid(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#isZustimmungElektronischerBescheid <em>Zustimmung Elektronischer Bescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungElektronischerBescheid()
	 * @see #isZustimmungElektronischerBescheid()
	 * @see #setZustimmungElektronischerBescheid(boolean)
	 * @generated
	 */
	void unsetZustimmungElektronischerBescheid();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#isZustimmungElektronischerBescheid <em>Zustimmung Elektronischer Bescheid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Elektronischer Bescheid</em>' attribute is set.
	 * @see #unsetZustimmungElektronischerBescheid()
	 * @see #isZustimmungElektronischerBescheid()
	 * @see #setZustimmungElektronischerBescheid(boolean)
	 * @generated
	 */
	boolean isSetZustimmungElektronischerBescheid();

} // PostkorbHandleType
