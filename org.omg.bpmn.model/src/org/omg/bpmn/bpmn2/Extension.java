/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.omg.bpmn.bpmn2;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.Extension#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.Extension#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.Extension#getXsdDefinition <em>Xsd Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getExtension()
 * @model extendedMetaData="name='tExtension' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(ExtensionDefinition)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getExtension_Definition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExtensionDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Extension#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ExtensionDefinition value);

	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #setMustUnderstand(boolean)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getExtension_MustUnderstand()
	 * @model default="false" ordered="false"
	 *        extendedMetaData="kind='attribute' name='mustUnderstand'"
	 * @generated
	 */
	boolean isMustUnderstand();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Extension#isMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #isMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(boolean value);

	/**
	 * Returns the value of the '<em><b>Xsd Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Definition</em>' attribute.
	 * @see #setXsdDefinition(QName)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getExtension_XsdDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='definition'"
	 * @generated
	 */
	QName getXsdDefinition();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Extension#getXsdDefinition <em>Xsd Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Definition</em>' attribute.
	 * @see #getXsdDefinition()
	 * @generated
	 */
	void setXsdDefinition(QName value);

} // Extension
