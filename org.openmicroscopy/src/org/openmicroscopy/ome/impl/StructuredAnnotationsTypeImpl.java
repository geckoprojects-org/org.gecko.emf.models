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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.BooleanAnnotationType;
import org.openmicroscopy.ome.CommentAnnotationType;
import org.openmicroscopy.ome.DoubleAnnotationType;
import org.openmicroscopy.ome.FileAnnotationType;
import org.openmicroscopy.ome.ListAnnotationType;
import org.openmicroscopy.ome.LongAnnotationType;
import org.openmicroscopy.ome.MapAnnotationType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.StructuredAnnotationsType;
import org.openmicroscopy.ome.TagAnnotationType;
import org.openmicroscopy.ome.TermAnnotationType;
import org.openmicroscopy.ome.TimestampAnnotationType;
import org.openmicroscopy.ome.XMLAnnotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Annotations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getXMLAnnotation <em>XML Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getFileAnnotation <em>File Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getListAnnotation <em>List Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getLongAnnotation <em>Long Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getDoubleAnnotation <em>Double Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getCommentAnnotation <em>Comment Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getBooleanAnnotation <em>Boolean Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getTimestampAnnotation <em>Timestamp Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getTagAnnotation <em>Tag Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getTermAnnotation <em>Term Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl#getMapAnnotation <em>Map Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredAnnotationsTypeImpl extends MinimalEObjectImpl.Container implements StructuredAnnotationsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredAnnotationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getStructuredAnnotationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XMLAnnotationType> getXMLAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_XMLAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FileAnnotationType> getFileAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_FileAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListAnnotationType> getListAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_ListAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongAnnotationType> getLongAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_LongAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoubleAnnotationType> getDoubleAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_DoubleAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentAnnotationType> getCommentAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_CommentAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanAnnotationType> getBooleanAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_BooleanAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimestampAnnotationType> getTimestampAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_TimestampAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagAnnotationType> getTagAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_TagAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TermAnnotationType> getTermAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_TermAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapAnnotationType> getMapAnnotation() {
		return getGroup().list(OMEPackage.eINSTANCE.getStructuredAnnotationsType_MapAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__XML_ANNOTATION:
				return ((InternalEList<?>)getXMLAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__FILE_ANNOTATION:
				return ((InternalEList<?>)getFileAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LIST_ANNOTATION:
				return ((InternalEList<?>)getListAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LONG_ANNOTATION:
				return ((InternalEList<?>)getLongAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__DOUBLE_ANNOTATION:
				return ((InternalEList<?>)getDoubleAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__COMMENT_ANNOTATION:
				return ((InternalEList<?>)getCommentAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__BOOLEAN_ANNOTATION:
				return ((InternalEList<?>)getBooleanAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TIMESTAMP_ANNOTATION:
				return ((InternalEList<?>)getTimestampAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TAG_ANNOTATION:
				return ((InternalEList<?>)getTagAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TERM_ANNOTATION:
				return ((InternalEList<?>)getTermAnnotation()).basicRemove(otherEnd, msgs);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__MAP_ANNOTATION:
				return ((InternalEList<?>)getMapAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__XML_ANNOTATION:
				return getXMLAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__FILE_ANNOTATION:
				return getFileAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LIST_ANNOTATION:
				return getListAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LONG_ANNOTATION:
				return getLongAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__DOUBLE_ANNOTATION:
				return getDoubleAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__COMMENT_ANNOTATION:
				return getCommentAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__BOOLEAN_ANNOTATION:
				return getBooleanAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TIMESTAMP_ANNOTATION:
				return getTimestampAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TAG_ANNOTATION:
				return getTagAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TERM_ANNOTATION:
				return getTermAnnotation();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__MAP_ANNOTATION:
				return getMapAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__XML_ANNOTATION:
				getXMLAnnotation().clear();
				getXMLAnnotation().addAll((Collection<? extends XMLAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__FILE_ANNOTATION:
				getFileAnnotation().clear();
				getFileAnnotation().addAll((Collection<? extends FileAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LIST_ANNOTATION:
				getListAnnotation().clear();
				getListAnnotation().addAll((Collection<? extends ListAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LONG_ANNOTATION:
				getLongAnnotation().clear();
				getLongAnnotation().addAll((Collection<? extends LongAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__DOUBLE_ANNOTATION:
				getDoubleAnnotation().clear();
				getDoubleAnnotation().addAll((Collection<? extends DoubleAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__COMMENT_ANNOTATION:
				getCommentAnnotation().clear();
				getCommentAnnotation().addAll((Collection<? extends CommentAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__BOOLEAN_ANNOTATION:
				getBooleanAnnotation().clear();
				getBooleanAnnotation().addAll((Collection<? extends BooleanAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TIMESTAMP_ANNOTATION:
				getTimestampAnnotation().clear();
				getTimestampAnnotation().addAll((Collection<? extends TimestampAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TAG_ANNOTATION:
				getTagAnnotation().clear();
				getTagAnnotation().addAll((Collection<? extends TagAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TERM_ANNOTATION:
				getTermAnnotation().clear();
				getTermAnnotation().addAll((Collection<? extends TermAnnotationType>)newValue);
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__MAP_ANNOTATION:
				getMapAnnotation().clear();
				getMapAnnotation().addAll((Collection<? extends MapAnnotationType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__XML_ANNOTATION:
				getXMLAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__FILE_ANNOTATION:
				getFileAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LIST_ANNOTATION:
				getListAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LONG_ANNOTATION:
				getLongAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__DOUBLE_ANNOTATION:
				getDoubleAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__COMMENT_ANNOTATION:
				getCommentAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__BOOLEAN_ANNOTATION:
				getBooleanAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TIMESTAMP_ANNOTATION:
				getTimestampAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TAG_ANNOTATION:
				getTagAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TERM_ANNOTATION:
				getTermAnnotation().clear();
				return;
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__MAP_ANNOTATION:
				getMapAnnotation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__XML_ANNOTATION:
				return !getXMLAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__FILE_ANNOTATION:
				return !getFileAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LIST_ANNOTATION:
				return !getListAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__LONG_ANNOTATION:
				return !getLongAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__DOUBLE_ANNOTATION:
				return !getDoubleAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__COMMENT_ANNOTATION:
				return !getCommentAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__BOOLEAN_ANNOTATION:
				return !getBooleanAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TIMESTAMP_ANNOTATION:
				return !getTimestampAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TAG_ANNOTATION:
				return !getTagAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__TERM_ANNOTATION:
				return !getTermAnnotation().isEmpty();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE__MAP_ANNOTATION:
				return !getMapAnnotation().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //StructuredAnnotationsTypeImpl
