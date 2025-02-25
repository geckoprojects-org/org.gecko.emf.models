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
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.LineType#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LineType#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LineType#getX1 <em>X1</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LineType#getX2 <em>X2</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LineType#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LineType#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getLineType()
 * @model extendedMetaData="name='Line_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineType extends Shape {
	/**
	 * Returns the value of the '<em><b>Marker End</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.Marker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End</em>' attribute.
	 * @see org.openmicroscopy.ome.Marker
	 * @see #isSetMarkerEnd()
	 * @see #unsetMarkerEnd()
	 * @see #setMarkerEnd(Marker)
	 * @see org.openmicroscopy.ome.OMEPackage#getLineType_MarkerEnd()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MarkerEnd'"
	 * @generated
	 */
	Marker getMarkerEnd();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LineType#getMarkerEnd <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End</em>' attribute.
	 * @see org.openmicroscopy.ome.Marker
	 * @see #isSetMarkerEnd()
	 * @see #unsetMarkerEnd()
	 * @see #getMarkerEnd()
	 * @generated
	 */
	void setMarkerEnd(Marker value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LineType#getMarkerEnd <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkerEnd()
	 * @see #getMarkerEnd()
	 * @see #setMarkerEnd(Marker)
	 * @generated
	 */
	void unsetMarkerEnd();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LineType#getMarkerEnd <em>Marker End</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marker End</em>' attribute is set.
	 * @see #unsetMarkerEnd()
	 * @see #getMarkerEnd()
	 * @see #setMarkerEnd(Marker)
	 * @generated
	 */
	boolean isSetMarkerEnd();

	/**
	 * Returns the value of the '<em><b>Marker Start</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.Marker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Start</em>' attribute.
	 * @see org.openmicroscopy.ome.Marker
	 * @see #isSetMarkerStart()
	 * @see #unsetMarkerStart()
	 * @see #setMarkerStart(Marker)
	 * @see org.openmicroscopy.ome.OMEPackage#getLineType_MarkerStart()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MarkerStart'"
	 * @generated
	 */
	Marker getMarkerStart();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LineType#getMarkerStart <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Start</em>' attribute.
	 * @see org.openmicroscopy.ome.Marker
	 * @see #isSetMarkerStart()
	 * @see #unsetMarkerStart()
	 * @see #getMarkerStart()
	 * @generated
	 */
	void setMarkerStart(Marker value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LineType#getMarkerStart <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkerStart()
	 * @see #getMarkerStart()
	 * @see #setMarkerStart(Marker)
	 * @generated
	 */
	void unsetMarkerStart();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LineType#getMarkerStart <em>Marker Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marker Start</em>' attribute is set.
	 * @see #unsetMarkerStart()
	 * @see #getMarkerStart()
	 * @see #setMarkerStart(Marker)
	 * @generated
	 */
	boolean isSetMarkerStart();

	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The X coordinate of the start of the line. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #setX1(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLineType_X1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='X1'"
	 * @generated
	 */
	float getX1();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LineType#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #getX1()
	 * @generated
	 */
	void setX1(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LineType#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX1()
	 * @see #getX1()
	 * @see #setX1(float)
	 * @generated
	 */
	void unsetX1();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LineType#getX1 <em>X1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X1</em>' attribute is set.
	 * @see #unsetX1()
	 * @see #getX1()
	 * @see #setX1(float)
	 * @generated
	 */
	boolean isSetX1();

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The X coordinate of the end of the line. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #setX2(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLineType_X2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='X2'"
	 * @generated
	 */
	float getX2();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LineType#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #getX2()
	 * @generated
	 */
	void setX2(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LineType#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX2()
	 * @see #getX2()
	 * @see #setX2(float)
	 * @generated
	 */
	void unsetX2();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LineType#getX2 <em>X2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X2</em>' attribute is set.
	 * @see #unsetX2()
	 * @see #getX2()
	 * @see #setX2(float)
	 * @generated
	 */
	boolean isSetX2();

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Y coordinate of the start of the line. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #setY1(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLineType_Y1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='Y1'"
	 * @generated
	 */
	float getY1();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LineType#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #getY1()
	 * @generated
	 */
	void setY1(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LineType#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1()
	 * @see #getY1()
	 * @see #setY1(float)
	 * @generated
	 */
	void unsetY1();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LineType#getY1 <em>Y1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1</em>' attribute is set.
	 * @see #unsetY1()
	 * @see #getY1()
	 * @see #setY1(float)
	 * @generated
	 */
	boolean isSetY1();

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Y coordinate of the end of the line. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #setY2(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLineType_Y2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='Y2'"
	 * @generated
	 */
	float getY2();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LineType#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #getY2()
	 * @generated
	 */
	void setY2(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LineType#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2()
	 * @see #getY2()
	 * @see #setY2(float)
	 * @generated
	 */
	void unsetY2();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LineType#getY2 <em>Y2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2</em>' attribute is set.
	 * @see #unsetY2()
	 * @see #getY2()
	 * @see #setY2(float)
	 * @generated
	 */
	boolean isSetY2();

} // LineType
