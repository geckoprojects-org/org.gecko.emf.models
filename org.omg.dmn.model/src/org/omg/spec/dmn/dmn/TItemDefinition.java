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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TItem Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#getAllowedValues <em>Allowed Values</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeConstraint <em>Type Constraint</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#getItemComponent <em>Item Component</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#getFunctionItem <em>Function Item</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeLanguage <em>Type Language</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition()
 * @model extendedMetaData="name='tItemDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TItemDefinition extends TNamedElement {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' attribute.
	 * @see #setTypeRef(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='typeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Values</em>' containment reference.
	 * @see #setAllowedValues(TUnaryTests)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_AllowedValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	TUnaryTests getAllowedValues();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#getAllowedValues <em>Allowed Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Values</em>' containment reference.
	 * @see #getAllowedValues()
	 * @generated
	 */
	void setAllowedValues(TUnaryTests value);

	/**
	 * Returns the value of the '<em><b>Type Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Constraint</em>' containment reference.
	 * @see #setTypeConstraint(TUnaryTests)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_TypeConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	TUnaryTests getTypeConstraint();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeConstraint <em>Type Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Constraint</em>' containment reference.
	 * @see #getTypeConstraint()
	 * @generated
	 */
	void setTypeConstraint(TUnaryTests value);

	/**
	 * Returns the value of the '<em><b>Item Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Component</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_ItemComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TItemDefinition> getItemComponent();

	/**
	 * Returns the value of the '<em><b>Function Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Item</em>' containment reference.
	 * @see #setFunctionItem(TFunctionItem)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_FunctionItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='functionItem' namespace='##targetNamespace'"
	 * @generated
	 */
	TFunctionItem getFunctionItem();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#getFunctionItem <em>Function Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Item</em>' containment reference.
	 * @see #getFunctionItem()
	 * @generated
	 */
	void setFunctionItem(TFunctionItem value);

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #isSetIsCollection()
	 * @see #unsetIsCollection()
	 * @see #setIsCollection(boolean)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_IsCollection()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isCollection'"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isSetIsCollection()
	 * @see #unsetIsCollection()
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCollection()
	 * @see #isIsCollection()
	 * @see #setIsCollection(boolean)
	 * @generated
	 */
	void unsetIsCollection();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#isIsCollection <em>Is Collection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Collection</em>' attribute is set.
	 * @see #unsetIsCollection()
	 * @see #isIsCollection()
	 * @see #setIsCollection(boolean)
	 * @generated
	 */
	boolean isSetIsCollection();

	/**
	 * Returns the value of the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Language</em>' attribute.
	 * @see #setTypeLanguage(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTItemDefinition_TypeLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='typeLanguage'"
	 * @generated
	 */
	String getTypeLanguage();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeLanguage <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Language</em>' attribute.
	 * @see #getTypeLanguage()
	 * @generated
	 */
	void setTypeLanguage(String value);

} // TItemDefinition
