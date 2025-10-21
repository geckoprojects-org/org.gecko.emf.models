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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signatur Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information zur elektronischen Signatur
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#isElektronischSignieren <em>Elektronisch Signieren</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSignaturType()
 * @model extendedMetaData="name='SignaturType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignaturType extends EObject {
	/**
	 * Returns the value of the '<em><b>Elektronisch Signieren</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wollen Sie das Formular elektronisch signieren?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elektronisch Signieren</em>' attribute.
	 * @see #isSetElektronischSignieren()
	 * @see #unsetElektronischSignieren()
	 * @see #setElektronischSignieren(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSignaturType_ElektronischSignieren()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='elektronischSignieren' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isElektronischSignieren();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#isElektronischSignieren <em>Elektronisch Signieren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elektronisch Signieren</em>' attribute.
	 * @see #isSetElektronischSignieren()
	 * @see #unsetElektronischSignieren()
	 * @see #isElektronischSignieren()
	 * @generated
	 */
	void setElektronischSignieren(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#isElektronischSignieren <em>Elektronisch Signieren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElektronischSignieren()
	 * @see #isElektronischSignieren()
	 * @see #setElektronischSignieren(boolean)
	 * @generated
	 */
	void unsetElektronischSignieren();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#isElektronischSignieren <em>Elektronisch Signieren</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elektronisch Signieren</em>' attribute is set.
	 * @see #unsetElektronischSignieren()
	 * @see #isElektronischSignieren()
	 * @see #setElektronischSignieren(boolean)
	 * @generated
	 */
	boolean isSetElektronischSignieren();

	/**
	 * Returns the value of the '<em><b>Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterschriebenes Formular hochladen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anlage</em>' containment reference.
	 * @see #setAnlage(NachweisType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSignaturType_Anlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anlage' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getAnlage();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#getAnlage <em>Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlage</em>' containment reference.
	 * @see #getAnlage()
	 * @generated
	 */
	void setAnlage(NachweisType value);

} // SignaturType
