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

import net.opengis.ows.MetadataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stored Query Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.StoredQueryDescriptionType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wfs.StoredQueryDescriptionType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wfs.StoredQueryDescriptionType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.wfs.StoredQueryDescriptionType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.opengis.wfs.StoredQueryDescriptionType#getQueryExpressionText <em>Query Expression Text</em>}</li>
 *   <li>{@link net.opengis.wfs.StoredQueryDescriptionType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType()
 * @model extendedMetaData="name='StoredQueryDescriptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StoredQueryDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.MetadataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='http://www.opengis.net/ows/1.1'"
	 * @generated
	 */
	EList<MetadataType> getMetadata();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.ParameterExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterExpressionType> getParameter();

	/**
	 * Returns the value of the '<em><b>Query Expression Text</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.QueryExpressionTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression Text</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType_QueryExpressionText()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QueryExpressionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryExpressionTextType> getQueryExpressionText();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.wfs.WFSPackage#getStoredQueryDescriptionType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.StoredQueryDescriptionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // StoredQueryDescriptionType
