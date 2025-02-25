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
 * A representation of the model object '<em><b>Polyline Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.PolylineType#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PolylineType#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PolylineType#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getPolylineType()
 * @model extendedMetaData="name='Polyline_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolylineType extends Shape {
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
	 * @see org.openmicroscopy.ome.OMEPackage#getPolylineType_MarkerEnd()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MarkerEnd'"
	 * @generated
	 */
	Marker getMarkerEnd();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PolylineType#getMarkerEnd <em>Marker End</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PolylineType#getMarkerEnd <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkerEnd()
	 * @see #getMarkerEnd()
	 * @see #setMarkerEnd(Marker)
	 * @generated
	 */
	void unsetMarkerEnd();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PolylineType#getMarkerEnd <em>Marker End</em>}' attribute is set.
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
	 * @see org.openmicroscopy.ome.OMEPackage#getPolylineType_MarkerStart()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MarkerStart'"
	 * @generated
	 */
	Marker getMarkerStart();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PolylineType#getMarkerStart <em>Marker Start</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PolylineType#getMarkerStart <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkerStart()
	 * @see #getMarkerStart()
	 * @see #setMarkerStart(Marker)
	 * @generated
	 */
	void unsetMarkerStart();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PolylineType#getMarkerStart <em>Marker Start</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The points of the polyline are defined as a list of comma
	 *               separated x,y coordinates seperated by spaces like "x1,y1 x2,y2 x3,y3" e.g.
	 *               "0,0 1,2 3,5" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPolylineType_Points()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Points'"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PolylineType#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

} // PolylineType
