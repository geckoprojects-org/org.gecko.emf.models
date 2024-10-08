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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [complexType of] The style descriptor for a graph consisting of a number of features. Describes graph-specific style attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GraphStyleType#isPlanar <em>Planar</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#isDirected <em>Directed</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#isGrid <em>Grid</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#getMinDistance <em>Min Distance</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#getMinAngle <em>Min Angle</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#getGraphType <em>Graph Type</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#getDrawingType <em>Drawing Type</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#getLineType <em>Line Type</em>}</li>
 *   <li>{@link net.opengis.gml.GraphStyleType#getAestheticCriteria <em>Aesthetic Criteria</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGraphStyleType()
 * @model extendedMetaData="name='GraphStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GraphStyleType extends BaseStyleDescriptorType {
	/**
	 * Returns the value of the '<em><b>Planar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar</em>' attribute.
	 * @see #isSetPlanar()
	 * @see #unsetPlanar()
	 * @see #setPlanar(boolean)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_Planar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='planar' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPlanar();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#isPlanar <em>Planar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar</em>' attribute.
	 * @see #isSetPlanar()
	 * @see #unsetPlanar()
	 * @see #isPlanar()
	 * @generated
	 */
	void setPlanar(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#isPlanar <em>Planar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanar()
	 * @see #isPlanar()
	 * @see #setPlanar(boolean)
	 * @generated
	 */
	void unsetPlanar();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#isPlanar <em>Planar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar</em>' attribute is set.
	 * @see #unsetPlanar()
	 * @see #isPlanar()
	 * @see #setPlanar(boolean)
	 * @generated
	 */
	boolean isSetPlanar();

	/**
	 * Returns the value of the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed</em>' attribute.
	 * @see #isSetDirected()
	 * @see #unsetDirected()
	 * @see #setDirected(boolean)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_Directed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='directed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDirected();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#isDirected <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed</em>' attribute.
	 * @see #isSetDirected()
	 * @see #unsetDirected()
	 * @see #isDirected()
	 * @generated
	 */
	void setDirected(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#isDirected <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirected()
	 * @see #isDirected()
	 * @see #setDirected(boolean)
	 * @generated
	 */
	void unsetDirected();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#isDirected <em>Directed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Directed</em>' attribute is set.
	 * @see #unsetDirected()
	 * @see #isDirected()
	 * @see #setDirected(boolean)
	 * @generated
	 */
	boolean isSetDirected();

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' attribute.
	 * @see #isSetGrid()
	 * @see #unsetGrid()
	 * @see #setGrid(boolean)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_Grid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='grid' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGrid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#isGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #isSetGrid()
	 * @see #unsetGrid()
	 * @see #isGrid()
	 * @generated
	 */
	void setGrid(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#isGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrid()
	 * @see #isGrid()
	 * @see #setGrid(boolean)
	 * @generated
	 */
	void unsetGrid();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#isGrid <em>Grid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grid</em>' attribute is set.
	 * @see #unsetGrid()
	 * @see #isGrid()
	 * @see #setGrid(boolean)
	 * @generated
	 */
	boolean isSetGrid();

	/**
	 * Returns the value of the '<em><b>Min Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Distance</em>' attribute.
	 * @see #isSetMinDistance()
	 * @see #unsetMinDistance()
	 * @see #setMinDistance(double)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_MinDistance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinDistance();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#getMinDistance <em>Min Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Distance</em>' attribute.
	 * @see #isSetMinDistance()
	 * @see #unsetMinDistance()
	 * @see #getMinDistance()
	 * @generated
	 */
	void setMinDistance(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#getMinDistance <em>Min Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinDistance()
	 * @see #getMinDistance()
	 * @see #setMinDistance(double)
	 * @generated
	 */
	void unsetMinDistance();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#getMinDistance <em>Min Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Distance</em>' attribute is set.
	 * @see #unsetMinDistance()
	 * @see #getMinDistance()
	 * @see #setMinDistance(double)
	 * @generated
	 */
	boolean isSetMinDistance();

	/**
	 * Returns the value of the '<em><b>Min Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Angle</em>' attribute.
	 * @see #isSetMinAngle()
	 * @see #unsetMinAngle()
	 * @see #setMinAngle(double)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_MinAngle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#getMinAngle <em>Min Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Angle</em>' attribute.
	 * @see #isSetMinAngle()
	 * @see #unsetMinAngle()
	 * @see #getMinAngle()
	 * @generated
	 */
	void setMinAngle(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#getMinAngle <em>Min Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinAngle()
	 * @see #getMinAngle()
	 * @see #setMinAngle(double)
	 * @generated
	 */
	void unsetMinAngle();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#getMinAngle <em>Min Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Angle</em>' attribute is set.
	 * @see #unsetMinAngle()
	 * @see #getMinAngle()
	 * @see #setMinAngle(double)
	 * @generated
	 */
	boolean isSetMinAngle();

	/**
	 * Returns the value of the '<em><b>Graph Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.GraphTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Type</em>' attribute.
	 * @see net.opengis.gml.GraphTypeType
	 * @see #isSetGraphType()
	 * @see #unsetGraphType()
	 * @see #setGraphType(GraphTypeType)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_GraphType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='graphType' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphTypeType getGraphType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#getGraphType <em>Graph Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Type</em>' attribute.
	 * @see net.opengis.gml.GraphTypeType
	 * @see #isSetGraphType()
	 * @see #unsetGraphType()
	 * @see #getGraphType()
	 * @generated
	 */
	void setGraphType(GraphTypeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#getGraphType <em>Graph Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphType()
	 * @see #getGraphType()
	 * @see #setGraphType(GraphTypeType)
	 * @generated
	 */
	void unsetGraphType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#getGraphType <em>Graph Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Type</em>' attribute is set.
	 * @see #unsetGraphType()
	 * @see #getGraphType()
	 * @see #setGraphType(GraphTypeType)
	 * @generated
	 */
	boolean isSetGraphType();

	/**
	 * Returns the value of the '<em><b>Drawing Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.DrawingTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing Type</em>' attribute.
	 * @see net.opengis.gml.DrawingTypeType
	 * @see #isSetDrawingType()
	 * @see #unsetDrawingType()
	 * @see #setDrawingType(DrawingTypeType)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_DrawingType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='drawingType' namespace='##targetNamespace'"
	 * @generated
	 */
	DrawingTypeType getDrawingType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#getDrawingType <em>Drawing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Type</em>' attribute.
	 * @see net.opengis.gml.DrawingTypeType
	 * @see #isSetDrawingType()
	 * @see #unsetDrawingType()
	 * @see #getDrawingType()
	 * @generated
	 */
	void setDrawingType(DrawingTypeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#getDrawingType <em>Drawing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingType()
	 * @see #getDrawingType()
	 * @see #setDrawingType(DrawingTypeType)
	 * @generated
	 */
	void unsetDrawingType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#getDrawingType <em>Drawing Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drawing Type</em>' attribute is set.
	 * @see #unsetDrawingType()
	 * @see #getDrawingType()
	 * @see #setDrawingType(DrawingTypeType)
	 * @generated
	 */
	boolean isSetDrawingType();

	/**
	 * Returns the value of the '<em><b>Line Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.LineTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Type</em>' attribute.
	 * @see net.opengis.gml.LineTypeType
	 * @see #isSetLineType()
	 * @see #unsetLineType()
	 * @see #setLineType(LineTypeType)
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_LineType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='lineType' namespace='##targetNamespace'"
	 * @generated
	 */
	LineTypeType getLineType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GraphStyleType#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Type</em>' attribute.
	 * @see net.opengis.gml.LineTypeType
	 * @see #isSetLineType()
	 * @see #unsetLineType()
	 * @see #getLineType()
	 * @generated
	 */
	void setLineType(LineTypeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.GraphStyleType#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineType()
	 * @see #getLineType()
	 * @see #setLineType(LineTypeType)
	 * @generated
	 */
	void unsetLineType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.GraphStyleType#getLineType <em>Line Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Type</em>' attribute is set.
	 * @see #unsetLineType()
	 * @see #getLineType()
	 * @see #setLineType(LineTypeType)
	 * @generated
	 */
	boolean isSetLineType();

	/**
	 * Returns the value of the '<em><b>Aesthetic Criteria</b></em>' attribute list.
	 * The list contents are of type {@link net.opengis.gml.AesheticCriteriaType}.
	 * The literals are from the enumeration {@link net.opengis.gml.AesheticCriteriaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aesthetic Criteria</em>' attribute list.
	 * @see net.opengis.gml.AesheticCriteriaType
	 * @see net.opengis.gml.GMLPackage#getGraphStyleType_AestheticCriteria()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='aestheticCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AesheticCriteriaType> getAestheticCriteria();

} // GraphStyleType
