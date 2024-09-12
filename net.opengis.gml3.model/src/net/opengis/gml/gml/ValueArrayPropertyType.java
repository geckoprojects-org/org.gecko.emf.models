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
package net.opengis.gml.gml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getAbstractValueGroup <em>Abstract Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getAbstractValue <em>Abstract Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getAbstractGeometry <em>Abstract Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getAbstractTimeObjectGroup <em>Abstract Time Object Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getAbstractTimeObject <em>Abstract Time Object</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ValueArrayPropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType()
 * @model extendedMetaData="name='ValueArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValueArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Value:0'"
	 * @generated
	 */
	FeatureMap getValue();

	/**
	 * Returns the value of the '<em><b>Abstract Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractValue is an abstract element which acts as the head of a substitution group which contains gml:AbstractScalarValue, gml:AbstractScalarValueList, gml:CompositeValue and gml:ValueExtent, and (transitively) the elements in their substitution groups.
	 * These elements may be used in an application schema as variables, so that in an XML instance document any member of its substitution group may occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Value Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_AbstractValueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractValue:group' namespace='##targetNamespace' group='#Value:0'"
	 * @generated
	 */
	FeatureMap getAbstractValueGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractValue is an abstract element which acts as the head of a substitution group which contains gml:AbstractScalarValue, gml:AbstractScalarValueList, gml:CompositeValue and gml:ValueExtent, and (transitively) the elements in their substitution groups.
	 * These elements may be used in an application schema as variables, so that in an XML instance document any member of its substitution group may occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Value</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_AbstractValue()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractValue' namespace='##targetNamespace' group='AbstractValue:group'"
	 * @generated
	 */
	EList<EObject> getAbstractValue();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractGeometry element is the abstract head of the substitution group for all geometry elements of GML. This includes pre-defined and user-defined geometry elements. Any geometry element shall be a direct or indirect extension/restriction of AbstractGeometryType and shall be directly or indirectly in the substitution group of AbstractGeometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Geometry Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_AbstractGeometryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractGeometry:group' namespace='##targetNamespace' group='#Value:0'"
	 * @generated
	 */
	FeatureMap getAbstractGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.AbstractGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractGeometry element is the abstract head of the substitution group for all geometry elements of GML. This includes pre-defined and user-defined geometry elements. Any geometry element shall be a direct or indirect extension/restriction of AbstractGeometryType and shall be directly or indirectly in the substitution group of AbstractGeometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Geometry</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_AbstractGeometry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometry' namespace='##targetNamespace' group='AbstractGeometry:group'"
	 * @generated
	 */
	EList<AbstractGeometryType> getAbstractGeometry();

	/**
	 * Returns the value of the '<em><b>Abstract Time Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTimeObject acts as the head of a substitution group for all temporal primitives and complexes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Object Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_AbstractTimeObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractTimeObject:group' namespace='##targetNamespace' group='#Value:0'"
	 * @generated
	 */
	FeatureMap getAbstractTimeObjectGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Time Object</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.AbstractTimeObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTimeObject acts as the head of a substitution group for all temporal primitives and complexes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Object</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_AbstractTimeObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimeObject' namespace='##targetNamespace' group='AbstractTimeObject:group'"
	 * @generated
	 */
	EList<AbstractTimeObjectType> getAbstractTimeObject();

	/**
	 * Returns the value of the '<em><b>Null</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_Null()
	 * @model unique="false" dataType="net.opengis.gml.gml.NilReasonType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace' group='#Value:0'"
	 * @generated
	 */
	EList<Object> getNull();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getValueArrayPropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ValueArrayPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @generated
	 */
	void setOwns(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.ValueArrayPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.ValueArrayPropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // ValueArrayPropertyType
