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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#getMaximalComplex <em>Maximal Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#getSuperComplex <em>Super Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#getSubComplex <em>Sub Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#getTopoPrimitiveMember <em>Topo Primitive Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoComplexType#isIsMaximal <em>Is Maximal</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType()
 * @model extendedMetaData="name='TopoComplexType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoComplexType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Maximal Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximal Complex</em>' containment reference.
	 * @see #setMaximalComplex(TopoComplexPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_MaximalComplex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maximalComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoComplexPropertyType getMaximalComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoComplexType#getMaximalComplex <em>Maximal Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximal Complex</em>' containment reference.
	 * @see #getMaximalComplex()
	 * @generated
	 */
	void setMaximalComplex(TopoComplexPropertyType value);

	/**
	 * Returns the value of the '<em><b>Super Complex</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.TopoComplexPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Complex</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_SuperComplex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='superComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TopoComplexPropertyType> getSuperComplex();

	/**
	 * Returns the value of the '<em><b>Sub Complex</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.TopoComplexPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Complex</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_SubComplex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TopoComplexPropertyType> getSubComplex();

	/**
	 * Returns the value of the '<em><b>Topo Primitive Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.TopoPrimitiveMemberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoPrimitiveMember property element encodes for the relationship between a topology complex and a single topology primitive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Primitive Member</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_TopoPrimitiveMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topoPrimitiveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TopoPrimitiveMemberType> getTopoPrimitiveMember();

	/**
	 * Returns the value of the '<em><b>Topo Primitive Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoPrimitiveMembers property element encodes the relationship between a topology complex and an arbitrary number of topology primitives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Primitive Members</em>' containment reference.
	 * @see #setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_TopoPrimitiveMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topoPrimitiveMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoComplexType#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Primitive Members</em>' containment reference.
	 * @see #getTopoPrimitiveMembers()
	 * @generated
	 */
	void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml.gml.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoComplexType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml.gml.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.TopoComplexType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TopoComplexType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

	/**
	 * Returns the value of the '<em><b>Is Maximal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Maximal</em>' attribute.
	 * @see #isSetIsMaximal()
	 * @see #unsetIsMaximal()
	 * @see #setIsMaximal(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoComplexType_IsMaximal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isMaximal'"
	 * @generated
	 */
	boolean isIsMaximal();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoComplexType#isIsMaximal <em>Is Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maximal</em>' attribute.
	 * @see #isSetIsMaximal()
	 * @see #unsetIsMaximal()
	 * @see #isIsMaximal()
	 * @generated
	 */
	void setIsMaximal(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.TopoComplexType#isIsMaximal <em>Is Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMaximal()
	 * @see #isIsMaximal()
	 * @see #setIsMaximal(boolean)
	 * @generated
	 */
	void unsetIsMaximal();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TopoComplexType#isIsMaximal <em>Is Maximal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Maximal</em>' attribute is set.
	 * @see #unsetIsMaximal()
	 * @see #isIsMaximal()
	 * @see #setIsMaximal(boolean)
	 * @generated
	 */
	boolean isSetIsMaximal();

} // TopoComplexType
