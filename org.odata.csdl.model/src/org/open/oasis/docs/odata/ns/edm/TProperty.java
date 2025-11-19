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
 * A representation of the model object '<em><b>TProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getScale <em>Scale</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getSRID <em>SRID</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TProperty#isUnicode <em>Unicode</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty()
 * @model extendedMetaData="name='TProperty' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DefaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_MaxLength()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TMaxLengthFacet"
	 *        extendedMetaData="kind='attribute' name='MaxLength'"
	 * @generated
	 */
	Object getMaxLength();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getMaxLength <em>Max Length</em>}' attribute.
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #setNullable(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Nullable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Nullable'"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	void unsetNullable();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isNullable <em>Nullable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nullable</em>' attribute is set.
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	boolean isSetNullable();

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(BigInteger)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Precision()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPrecisionFacet"
	 *        extendedMetaData="kind='attribute' name='Precision'"
	 * @generated
	 */
	BigInteger getPrecision();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getPrecision <em>Precision</em>}' attribute.
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Scale()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TScaleFacet"
	 *        extendedMetaData="kind='attribute' name='Scale'"
	 * @generated
	 */
	Object getScale();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getScale <em>Scale</em>}' attribute.
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_SRID()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSridFacet"
	 *        extendedMetaData="kind='attribute' name='SRID'"
	 * @generated
	 */
	Object getSRID();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getSRID <em>SRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRID</em>' attribute.
	 * @see #getSRID()
	 * @generated
	 */
	void setSRID(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Type()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TTypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unicode</em>' attribute.
	 * @see #isSetUnicode()
	 * @see #unsetUnicode()
	 * @see #setUnicode(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTProperty_Unicode()
	 * @model unsettable="true" dataType="org.open.oasis.docs.odata.ns.edm.TUnicodeFacet"
	 *        extendedMetaData="kind='attribute' name='Unicode'"
	 * @generated
	 */
	boolean isUnicode();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isUnicode <em>Unicode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isUnicode <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnicode()
	 * @see #isUnicode()
	 * @see #setUnicode(boolean)
	 * @generated
	 */
	void unsetUnicode();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isUnicode <em>Unicode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unicode</em>' attribute is set.
	 * @see #unsetUnicode()
	 * @see #isUnicode()
	 * @see #setUnicode(boolean)
	 * @generated
	 */
	boolean isSetUnicode();

} // TProperty
