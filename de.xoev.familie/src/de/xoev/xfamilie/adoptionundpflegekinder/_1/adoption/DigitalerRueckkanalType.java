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
 * A representation of the model object '<em><b>Digitaler Rueckkanal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum digitalen Rückkanal
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#getPostfachUUID <em>Postfach UUID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#isEinverstaendnisDigitalerRueckkanal <em>Einverstaendnis Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getDigitalerRueckkanalType()
 * @model extendedMetaData="name='DigitalerRueckkanalType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DigitalerRueckkanalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Postfach UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostfachUUID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postfach UUID</em>' attribute.
	 * @see #setPostfachUUID(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getDigitalerRueckkanalType_PostfachUUID()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='postfachUUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostfachUUID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#getPostfachUUID <em>Postfach UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfach UUID</em>' attribute.
	 * @see #getPostfachUUID()
	 * @generated
	 */
	void setPostfachUUID(String value);

	/**
	 * Returns the value of the '<em><b>Einverstaendnis Digitaler Rueckkanal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich bin damit einverstanden, dass meine Bescheide in mein elektronisches Postfach zugestellt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einverstaendnis Digitaler Rueckkanal</em>' attribute.
	 * @see #isSetEinverstaendnisDigitalerRueckkanal()
	 * @see #unsetEinverstaendnisDigitalerRueckkanal()
	 * @see #setEinverstaendnisDigitalerRueckkanal(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getDigitalerRueckkanalType_EinverstaendnisDigitalerRueckkanal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einverstaendnisDigitalerRueckkanal' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinverstaendnisDigitalerRueckkanal();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#isEinverstaendnisDigitalerRueckkanal <em>Einverstaendnis Digitaler Rueckkanal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einverstaendnis Digitaler Rueckkanal</em>' attribute.
	 * @see #isSetEinverstaendnisDigitalerRueckkanal()
	 * @see #unsetEinverstaendnisDigitalerRueckkanal()
	 * @see #isEinverstaendnisDigitalerRueckkanal()
	 * @generated
	 */
	void setEinverstaendnisDigitalerRueckkanal(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#isEinverstaendnisDigitalerRueckkanal <em>Einverstaendnis Digitaler Rueckkanal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinverstaendnisDigitalerRueckkanal()
	 * @see #isEinverstaendnisDigitalerRueckkanal()
	 * @see #setEinverstaendnisDigitalerRueckkanal(boolean)
	 * @generated
	 */
	void unsetEinverstaendnisDigitalerRueckkanal();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#isEinverstaendnisDigitalerRueckkanal <em>Einverstaendnis Digitaler Rueckkanal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einverstaendnis Digitaler Rueckkanal</em>' attribute is set.
	 * @see #unsetEinverstaendnisDigitalerRueckkanal()
	 * @see #isEinverstaendnisDigitalerRueckkanal()
	 * @see #setEinverstaendnisDigitalerRueckkanal(boolean)
	 * @generated
	 */
	boolean isSetEinverstaendnisDigitalerRueckkanal();

} // DigitalerRueckkanalType
