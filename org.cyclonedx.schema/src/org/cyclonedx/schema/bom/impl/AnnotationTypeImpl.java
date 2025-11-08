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
package org.cyclonedx.schema.bom.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.AnnotationType;
import org.cyclonedx.schema.bom.AnnotatorChoiceType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.SubjectsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getAnnotator <em>Annotator</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeImpl extends MinimalEObjectImpl.Container implements AnnotationType {
	/**
	 * The cached value of the '{@link #getSubjects() <em>Subjects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected SubjectsType subjects;

	/**
	 * The cached value of the '{@link #getAnnotator() <em>Annotator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotator()
	 * @generated
	 * @ordered
	 */
	protected AnnotatorChoiceType annotator;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getAnnotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectsType getSubjects() {
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjects(SubjectsType newSubjects, NotificationChain msgs) {
		SubjectsType oldSubjects = subjects;
		subjects = newSubjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__SUBJECTS, oldSubjects, newSubjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjects(SubjectsType newSubjects) {
		if (newSubjects != subjects) {
			NotificationChain msgs = null;
			if (subjects != null)
				msgs = ((InternalEObject)subjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ANNOTATION_TYPE__SUBJECTS, null, msgs);
			if (newSubjects != null)
				msgs = ((InternalEObject)newSubjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ANNOTATION_TYPE__SUBJECTS, null, msgs);
			msgs = basicSetSubjects(newSubjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__SUBJECTS, newSubjects, newSubjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatorChoiceType getAnnotator() {
		return annotator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotator(AnnotatorChoiceType newAnnotator, NotificationChain msgs) {
		AnnotatorChoiceType oldAnnotator = annotator;
		annotator = newAnnotator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__ANNOTATOR, oldAnnotator, newAnnotator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotator(AnnotatorChoiceType newAnnotator) {
		if (newAnnotator != annotator) {
			NotificationChain msgs = null;
			if (annotator != null)
				msgs = ((InternalEObject)annotator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ANNOTATION_TYPE__ANNOTATOR, null, msgs);
			if (newAnnotator != null)
				msgs = ((InternalEObject)newAnnotator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ANNOTATION_TYPE__ANNOTATOR, null, msgs);
			msgs = basicSetAnnotator(newAnnotator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__ANNOTATOR, newAnnotator, newAnnotator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.ANNOTATION_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANNOTATION_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.ANNOTATION_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ANNOTATION_TYPE__SUBJECTS:
				return basicSetSubjects(null, msgs);
			case BOMPackage.ANNOTATION_TYPE__ANNOTATOR:
				return basicSetAnnotator(null, msgs);
			case BOMPackage.ANNOTATION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.ANNOTATION_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.ANNOTATION_TYPE__SUBJECTS:
				return getSubjects();
			case BOMPackage.ANNOTATION_TYPE__ANNOTATOR:
				return getAnnotator();
			case BOMPackage.ANNOTATION_TYPE__TIMESTAMP:
				return getTimestamp();
			case BOMPackage.ANNOTATION_TYPE__TEXT:
				return getText();
			case BOMPackage.ANNOTATION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.ANNOTATION_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.ANNOTATION_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.ANNOTATION_TYPE__SUBJECTS:
				setSubjects((SubjectsType)newValue);
				return;
			case BOMPackage.ANNOTATION_TYPE__ANNOTATOR:
				setAnnotator((AnnotatorChoiceType)newValue);
				return;
			case BOMPackage.ANNOTATION_TYPE__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.ANNOTATION_TYPE__TEXT:
				setText((String)newValue);
				return;
			case BOMPackage.ANNOTATION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.ANNOTATION_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.ANNOTATION_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BOMPackage.ANNOTATION_TYPE__SUBJECTS:
				setSubjects((SubjectsType)null);
				return;
			case BOMPackage.ANNOTATION_TYPE__ANNOTATOR:
				setAnnotator((AnnotatorChoiceType)null);
				return;
			case BOMPackage.ANNOTATION_TYPE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case BOMPackage.ANNOTATION_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case BOMPackage.ANNOTATION_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.ANNOTATION_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.ANNOTATION_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BOMPackage.ANNOTATION_TYPE__SUBJECTS:
				return subjects != null;
			case BOMPackage.ANNOTATION_TYPE__ANNOTATOR:
				return annotator != null;
			case BOMPackage.ANNOTATION_TYPE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case BOMPackage.ANNOTATION_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case BOMPackage.ANNOTATION_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.ANNOTATION_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.ANNOTATION_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", text: ");
		result.append(text);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AnnotationTypeImpl
