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

import net.opengis.ows.KeywordsType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GML Object Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             An element of this type that describes a GML object in an
 *             application namespace shall have an xml xmlns specifier,
 *             e.g. xmlns:bo="http://www.BlueOx.org/BlueOx"
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.GMLObjectTypeType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wfs.GMLObjectTypeType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wfs.GMLObjectTypeType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wfs.GMLObjectTypeType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link net.opengis.wfs.GMLObjectTypeType#getOutputFormats <em>Output Formats</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeType()
 * @model extendedMetaData="name='GMLObjectTypeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GMLObjectTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Name of this GML Object type, including any namespace prefix.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(QName)
	 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.GMLObjectTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Title of this GML Object type, normally used for display
	 *                   to a human.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.GMLObjectTypeType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Brief narrative description of this GML Object type, normally
	 *                   used for display to a human.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeType_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.GMLObjectTypeType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.KeywordsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeType_Keywords()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Keywords' namespace='http://www.opengis.net/ows'"
	 * @generated
	 */
	EList<KeywordsType> getKeywords();

	/**
	 * Returns the value of the '<em><b>Output Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Formats</em>' containment reference.
	 * @see #setOutputFormats(OutputFormatListType)
	 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeType_OutputFormats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OutputFormats' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputFormatListType getOutputFormats();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.GMLObjectTypeType#getOutputFormats <em>Output Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Formats</em>' containment reference.
	 * @see #getOutputFormats()
	 * @generated
	 */
	void setOutputFormats(OutputFormatListType value);

} // GMLObjectTypeType
