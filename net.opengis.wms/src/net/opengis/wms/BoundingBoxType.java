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
package net.opengis.wms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getMaxx <em>Maxx</em>}</li>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getMaxy <em>Maxy</em>}</li>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getMinx <em>Minx</em>}</li>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getMiny <em>Miny</em>}</li>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getResx <em>Resx</em>}</li>
 *   <li>{@link net.opengis.wms.BoundingBoxType#getResy <em>Resy</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getBoundingBoxType()
 * @model extendedMetaData="name='BoundingBox_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface BoundingBoxType extends EObject {
	/**
	 * Returns the value of the '<em><b>CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRS</em>' attribute.
	 * @see #setCRS(String)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_CRS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='CRS'"
	 * @generated
	 */
	String getCRS();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getCRS <em>CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRS</em>' attribute.
	 * @see #getCRS()
	 * @generated
	 */
	void setCRS(String value);

	/**
	 * Returns the value of the '<em><b>Maxx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxx</em>' attribute.
	 * @see #isSetMaxx()
	 * @see #unsetMaxx()
	 * @see #setMaxx(double)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_Maxx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='maxx'"
	 * @generated
	 */
	double getMaxx();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getMaxx <em>Maxx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxx</em>' attribute.
	 * @see #isSetMaxx()
	 * @see #unsetMaxx()
	 * @see #getMaxx()
	 * @generated
	 */
	void setMaxx(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.BoundingBoxType#getMaxx <em>Maxx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxx()
	 * @see #getMaxx()
	 * @see #setMaxx(double)
	 * @generated
	 */
	void unsetMaxx();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.BoundingBoxType#getMaxx <em>Maxx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maxx</em>' attribute is set.
	 * @see #unsetMaxx()
	 * @see #getMaxx()
	 * @see #setMaxx(double)
	 * @generated
	 */
	boolean isSetMaxx();

	/**
	 * Returns the value of the '<em><b>Maxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxy</em>' attribute.
	 * @see #isSetMaxy()
	 * @see #unsetMaxy()
	 * @see #setMaxy(double)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_Maxy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='maxy'"
	 * @generated
	 */
	double getMaxy();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getMaxy <em>Maxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxy</em>' attribute.
	 * @see #isSetMaxy()
	 * @see #unsetMaxy()
	 * @see #getMaxy()
	 * @generated
	 */
	void setMaxy(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.BoundingBoxType#getMaxy <em>Maxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxy()
	 * @see #getMaxy()
	 * @see #setMaxy(double)
	 * @generated
	 */
	void unsetMaxy();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.BoundingBoxType#getMaxy <em>Maxy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maxy</em>' attribute is set.
	 * @see #unsetMaxy()
	 * @see #getMaxy()
	 * @see #setMaxy(double)
	 * @generated
	 */
	boolean isSetMaxy();

	/**
	 * Returns the value of the '<em><b>Minx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minx</em>' attribute.
	 * @see #isSetMinx()
	 * @see #unsetMinx()
	 * @see #setMinx(double)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_Minx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='minx'"
	 * @generated
	 */
	double getMinx();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getMinx <em>Minx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minx</em>' attribute.
	 * @see #isSetMinx()
	 * @see #unsetMinx()
	 * @see #getMinx()
	 * @generated
	 */
	void setMinx(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.BoundingBoxType#getMinx <em>Minx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinx()
	 * @see #getMinx()
	 * @see #setMinx(double)
	 * @generated
	 */
	void unsetMinx();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.BoundingBoxType#getMinx <em>Minx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minx</em>' attribute is set.
	 * @see #unsetMinx()
	 * @see #getMinx()
	 * @see #setMinx(double)
	 * @generated
	 */
	boolean isSetMinx();

	/**
	 * Returns the value of the '<em><b>Miny</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miny</em>' attribute.
	 * @see #isSetMiny()
	 * @see #unsetMiny()
	 * @see #setMiny(double)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_Miny()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='miny'"
	 * @generated
	 */
	double getMiny();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getMiny <em>Miny</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miny</em>' attribute.
	 * @see #isSetMiny()
	 * @see #unsetMiny()
	 * @see #getMiny()
	 * @generated
	 */
	void setMiny(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.BoundingBoxType#getMiny <em>Miny</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiny()
	 * @see #getMiny()
	 * @see #setMiny(double)
	 * @generated
	 */
	void unsetMiny();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.BoundingBoxType#getMiny <em>Miny</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Miny</em>' attribute is set.
	 * @see #unsetMiny()
	 * @see #getMiny()
	 * @see #setMiny(double)
	 * @generated
	 */
	boolean isSetMiny();

	/**
	 * Returns the value of the '<em><b>Resx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resx</em>' attribute.
	 * @see #isSetResx()
	 * @see #unsetResx()
	 * @see #setResx(double)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_Resx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='resx'"
	 * @generated
	 */
	double getResx();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getResx <em>Resx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resx</em>' attribute.
	 * @see #isSetResx()
	 * @see #unsetResx()
	 * @see #getResx()
	 * @generated
	 */
	void setResx(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.BoundingBoxType#getResx <em>Resx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResx()
	 * @see #getResx()
	 * @see #setResx(double)
	 * @generated
	 */
	void unsetResx();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.BoundingBoxType#getResx <em>Resx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resx</em>' attribute is set.
	 * @see #unsetResx()
	 * @see #getResx()
	 * @see #setResx(double)
	 * @generated
	 */
	boolean isSetResx();

	/**
	 * Returns the value of the '<em><b>Resy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resy</em>' attribute.
	 * @see #isSetResy()
	 * @see #unsetResy()
	 * @see #setResy(double)
	 * @see net.opengis.wms.WMSPackage#getBoundingBoxType_Resy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='resy'"
	 * @generated
	 */
	double getResy();

	/**
	 * Sets the value of the '{@link net.opengis.wms.BoundingBoxType#getResy <em>Resy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resy</em>' attribute.
	 * @see #isSetResy()
	 * @see #unsetResy()
	 * @see #getResy()
	 * @generated
	 */
	void setResy(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.BoundingBoxType#getResy <em>Resy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResy()
	 * @see #getResy()
	 * @see #setResy(double)
	 * @generated
	 */
	void unsetResy();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.BoundingBoxType#getResy <em>Resy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resy</em>' attribute is set.
	 * @see #unsetResy()
	 * @see #getResy()
	 * @see #setResy(double)
	 * @generated
	 */
	boolean isSetResy();

} // BoundingBoxType
