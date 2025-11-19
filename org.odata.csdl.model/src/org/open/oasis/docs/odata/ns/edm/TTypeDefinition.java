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
package org.open.oasis.docs.odata.ns.edm;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TType Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getScale <em>Scale</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getSRID <em>SRID</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#isUnicode <em>Unicode</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition()
 * @model extendedMetaData="name='TTypeDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_MaxLength()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TMaxLengthFacet"
	 *        extendedMetaData="kind='attribute' name='MaxLength'"
	 * @generated
	 */
	Object getMaxLength();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(BigInteger)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_Precision()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPrecisionFacet"
	 *        extendedMetaData="kind='attribute' name='Precision'"
	 * @generated
	 */
	BigInteger getPrecision();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_Scale()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TScaleFacet"
	 *        extendedMetaData="kind='attribute' name='Scale'"
	 * @generated
	 */
	Object getScale();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Object value);

	/**
	 * Returns the value of the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRID</em>' attribute.
	 * @see #setSRID(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_SRID()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSridFacet"
	 *        extendedMetaData="kind='attribute' name='SRID'"
	 * @generated
	 */
	Object getSRID();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getSRID <em>SRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRID</em>' attribute.
	 * @see #getSRID()
	 * @generated
	 */
	void setSRID(Object value);

	/**
	 * Returns the value of the '<em><b>Underlying Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlying Type</em>' attribute.
	 * @see #setUnderlyingType(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_UnderlyingType()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPrimitiveType" required="true"
	 *        extendedMetaData="kind='attribute' name='UnderlyingType'"
	 * @generated
	 */
	Object getUnderlyingType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getUnderlyingType <em>Underlying Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlying Type</em>' attribute.
	 * @see #getUnderlyingType()
	 * @generated
	 */
	void setUnderlyingType(Object value);

	/**
	 * Returns the value of the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unicode</em>' attribute.
	 * @see #isSetUnicode()
	 * @see #unsetUnicode()
	 * @see #setUnicode(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTypeDefinition_Unicode()
	 * @model unsettable="true" dataType="org.open.oasis.docs.odata.ns.edm.TUnicodeFacet"
	 *        extendedMetaData="kind='attribute' name='Unicode'"
	 * @generated
	 */
	boolean isUnicode();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#isUnicode <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unicode</em>' attribute.
	 * @see #isSetUnicode()
	 * @see #unsetUnicode()
	 * @see #isUnicode()
	 * @generated
	 */
	void setUnicode(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#isUnicode <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnicode()
	 * @see #isUnicode()
	 * @see #setUnicode(boolean)
	 * @generated
	 */
	void unsetUnicode();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#isUnicode <em>Unicode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unicode</em>' attribute is set.
	 * @see #unsetUnicode()
	 * @see #isUnicode()
	 * @see #setUnicode(boolean)
	 * @generated
	 */
	boolean isSetUnicode();

} // TTypeDefinition
