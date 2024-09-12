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

import net.opengis.gml.AbstractFeatureType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             An Insert element may contain a feature collection or one 
 *             or more feature instances to be inserted into the 
 *             repository.
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.InsertElementType#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertElementType#getFeature <em>Feature</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertElementType#getHandle <em>Handle</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertElementType#getIdgen <em>Idgen</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertElementType#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertElementType#getSrsName <em>Srs Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getInsertElementType()
 * @model extendedMetaData="name='InsertElementType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InsertElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Group</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getInsertElementType_FeatureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='_Feature:group' namespace='http://www.opengis.net/gml'"
	 * @generated
	 */
	FeatureMap getFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getInsertElementType_Feature()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Feature' namespace='http://www.opengis.net/gml' group='http://www.opengis.net/gml#_Feature:group'"
	 * @generated
	 */
	EList<AbstractFeatureType> getFeature();

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                The handle attribute allows a client application
	 *                to assign a client-generated request identifier
	 *                to an Insert action.  The handle is included to
	 *                facilitate error reporting.  If an Insert action
	 *                in a Transaction request fails, then a WFS may
	 *                include the handle in an exception report to localize
	 *                the error.  If no handle is included of the offending
	 *                Insert element then a WFS may employee other means of
	 *                localizing the error (e.g. line number).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see net.opengis.wfs.WFSPackage#getInsertElementType_Handle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handle'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.InsertElementType#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Idgen</b></em>' attribute.
	 * The default value is <code>"GenerateNew"</code>.
	 * The literals are from the enumeration {@link net.opengis.wfs.IdentifierGenerationOptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                The idgen attribute control how a WFS generates identifiers
	 *                from newly created feature instances using the Insert action.
	 *                The default action is to have the WFS generate a new id for
	 *                the features.  This is also backward compatible with WFS 1.0
	 *                where the only action was for the WFS to generate an new id.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idgen</em>' attribute.
	 * @see net.opengis.wfs.IdentifierGenerationOptionType
	 * @see #isSetIdgen()
	 * @see #unsetIdgen()
	 * @see #setIdgen(IdentifierGenerationOptionType)
	 * @see net.opengis.wfs.WFSPackage#getInsertElementType_Idgen()
	 * @model default="GenerateNew" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='idgen'"
	 * @generated
	 */
	IdentifierGenerationOptionType getIdgen();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.InsertElementType#getIdgen <em>Idgen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idgen</em>' attribute.
	 * @see net.opengis.wfs.IdentifierGenerationOptionType
	 * @see #isSetIdgen()
	 * @see #unsetIdgen()
	 * @see #getIdgen()
	 * @generated
	 */
	void setIdgen(IdentifierGenerationOptionType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.InsertElementType#getIdgen <em>Idgen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdgen()
	 * @see #getIdgen()
	 * @see #setIdgen(IdentifierGenerationOptionType)
	 * @generated
	 */
	void unsetIdgen();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.InsertElementType#getIdgen <em>Idgen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Idgen</em>' attribute is set.
	 * @see #unsetIdgen()
	 * @see #getIdgen()
	 * @see #setIdgen(IdentifierGenerationOptionType)
	 * @generated
	 */
	boolean isSetIdgen();

	/**
	 * Returns the value of the '<em><b>Input Format</b></em>' attribute.
	 * The default value is <code>"text/xml; subtype=gml/3.1.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                This inputFormat attribute is used to indicate 
	 *                the format used to encode a feature instance in
	 *                an Insert element.  The default value of
	 *                'text/xml; subtype=gml/3.1.1' is used to indicate
	 *                that feature encoding is GML3.  Another example
	 *                might be 'text/xml; subtype=gml/2.1.2' indicating
	 *                that the feature us encoded in GML2.  A WFS must
	 *                declare in the capabilities document, using a 
	 *                Parameter element, which version of GML it supports.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Format</em>' attribute.
	 * @see #isSetInputFormat()
	 * @see #unsetInputFormat()
	 * @see #setInputFormat(String)
	 * @see net.opengis.wfs.WFSPackage#getInsertElementType_InputFormat()
	 * @model default="text/xml; subtype=gml/3.1.1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inputFormat'"
	 * @generated
	 */
	String getInputFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.InsertElementType#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Format</em>' attribute.
	 * @see #isSetInputFormat()
	 * @see #unsetInputFormat()
	 * @see #getInputFormat()
	 * @generated
	 */
	void setInputFormat(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.InsertElementType#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputFormat()
	 * @see #getInputFormat()
	 * @see #setInputFormat(String)
	 * @generated
	 */
	void unsetInputFormat();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.InsertElementType#getInputFormat <em>Input Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Format</em>' attribute is set.
	 * @see #unsetInputFormat()
	 * @see #getInputFormat()
	 * @see #setInputFormat(String)
	 * @generated
	 */
	boolean isSetInputFormat();

	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               ===== PAV 12NOV2004 ====
	 *               WHY IS THIS HERE? WOULDN'T WE KNOW THE INCOMING SRS FROM THE 
	 *               GML GEOMETRY ELEMENTS?   I ASSUME THAT IF THE INCOMING SRS
	 *               DOES NOT MATCH ONE OF THE STORAGE SRS(s) THEN THE WFS WOULD
	 *               EITHER PROJECT INTO THE STORAGE SRS OR RAISE AN EXCEPTION.
	 *            
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.wfs.WFSPackage#getInsertElementType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.InsertElementType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

} // InsertElementType
