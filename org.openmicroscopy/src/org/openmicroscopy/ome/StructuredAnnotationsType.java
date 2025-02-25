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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Annotations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getXMLAnnotation <em>XML Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getFileAnnotation <em>File Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getListAnnotation <em>List Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getLongAnnotation <em>Long Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getDoubleAnnotation <em>Double Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getCommentAnnotation <em>Comment Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getBooleanAnnotation <em>Boolean Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getTimestampAnnotation <em>Timestamp Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getTagAnnotation <em>Tag Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getTermAnnotation <em>Term Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.StructuredAnnotationsType#getMapAnnotation <em>Map Annotation</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType()
 * @model extendedMetaData="name='StructuredAnnotations_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StructuredAnnotationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>XML Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.XMLAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An general xml annotation. The contents of this is not processed as OME XML but should still be well-formed XML.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_XMLAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XMLAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XMLAnnotationType> getXMLAnnotation();

	/**
	 * Returns the value of the '<em><b>File Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FileAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A file object annotation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_FileAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FileAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FileAnnotationType> getFileAnnotation();

	/**
	 * Returns the value of the '<em><b>List Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ListAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This annotation is a grouping object. It uses the sequence of
	 *         annotation refs from the base Annotation to form the list.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_ListAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ListAnnotationType> getListAnnotation();

	/**
	 * Returns the value of the '<em><b>Long Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.LongAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple numerical annotation of type xsd:long
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_LongAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LongAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LongAnnotationType> getLongAnnotation();

	/**
	 * Returns the value of the '<em><b>Double Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.DoubleAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple numerical annotation of type xsd:double
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_DoubleAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DoubleAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DoubleAnnotationType> getDoubleAnnotation();

	/**
	 * Returns the value of the '<em><b>Comment Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.CommentAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple comment annotation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_CommentAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommentAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CommentAnnotationType> getCommentAnnotation();

	/**
	 * Returns the value of the '<em><b>Boolean Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.BooleanAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple boolean annotation of type xsd:boolean
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_BooleanAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BooleanAnnotationType> getBooleanAnnotation();

	/**
	 * Returns the value of the '<em><b>Timestamp Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.TimestampAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A date/time annotation of type xsd:dateTime
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_TimestampAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimestampAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TimestampAnnotationType> getTimestampAnnotation();

	/**
	 * Returns the value of the '<em><b>Tag Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.TagAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A tag annotation (represents a tag or a tagset)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_TagAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TagAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TagAnnotationType> getTagAnnotation();

	/**
	 * Returns the value of the '<em><b>Term Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.TermAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A ontology term annotation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_TermAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TermAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TermAnnotationType> getTermAnnotation();

	/**
	 * Returns the value of the '<em><b>Map Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.MapAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An map annotation. The contents of this is a list of key/value pairs.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Annotation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getStructuredAnnotationsType_MapAnnotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MapAnnotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MapAnnotationType> getMapAnnotation();

} // StructuredAnnotationsType
