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
package net.opengis.wfs;

import javax.xml.namespace.QName;

import net.opengis.ogc.FilterType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.DeleteElementType#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.wfs.DeleteElementType#getHandle <em>Handle</em>}</li>
 *   <li>{@link net.opengis.wfs.DeleteElementType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getDeleteElementType()
 * @model extendedMetaData="name='DeleteElementType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeleteElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The Filter element is used to constrain the scope
	 *                   of the delete operation to those features identified
	 *                   by the filter.  Feature instances can be specified
	 *                   explicitly and individually using the identifier of
	 *                   each feature instance OR a set of features to be
	 *                   operated on can be identified by specifying spatial
	 *                   and non-spatial constraints in the filter.
	 *                   If no filter is specified then an exception should
	 *                   be raised since it is unlikely that a client application
	 *                   intends to delete all feature instances.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see net.opengis.wfs.WFSPackage#getDeleteElementType_Filter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='http://www.opengis.net/ogc'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.DeleteElementType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                The handle attribute allows a client application
	 *                to assign a client-generated request identifier
	 *                to an Insert action.  The handle is included to
	 *                facilitate error reporting.  If a Delete action
	 *                in a Transaction request fails, then a WFS may
	 *                include the handle in an exception report to localize
	 *                the error.  If no handle is included of the offending
	 *                Insert element then a WFS may employee other means of
	 *                localizing the error (e.g. line number).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see net.opengis.wfs.WFSPackage#getDeleteElementType_Handle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handle'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.DeleteElementType#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The value of the typeName attribute is the name 
	 *               of the feature type to be updated. The name
	 *               specified must be a valid type that belongs to
	 *               the feature content as defined by the GML
	 *               Application Schema.
	 *            
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(QName)
	 * @see net.opengis.wfs.WFSPackage#getDeleteElementType_TypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='typeName'"
	 * @generated
	 */
	QName getTypeName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.DeleteElementType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(QName value);

} // DeleteElementType
