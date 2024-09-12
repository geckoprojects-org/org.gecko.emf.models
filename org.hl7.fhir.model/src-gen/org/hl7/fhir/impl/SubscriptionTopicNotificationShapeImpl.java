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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.SubscriptionTopicNotificationShape;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Topic Notification Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicNotificationShapeImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicNotificationShapeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicNotificationShapeImpl#getRevInclude <em>Rev Include</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionTopicNotificationShapeImpl extends BackboneElementImpl implements SubscriptionTopicNotificationShape {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Uri resource;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> include;

	/**
	 * The cached value of the '{@link #getRevInclude() <em>Rev Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> revInclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionTopicNotificationShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubscriptionTopicNotificationShape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Uri newResource, NotificationChain msgs) {
		Uri oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE, oldResource, newResource);
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
	public void setResource(Uri newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getRevInclude() {
		if (revInclude == null) {
			revInclude = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__REV_INCLUDE);
		}
		return revInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE:
				return basicSetResource(null, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__REV_INCLUDE:
				return ((InternalEList<?>)getRevInclude()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE:
				return getResource();
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__INCLUDE:
				return getInclude();
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__REV_INCLUDE:
				return getRevInclude();
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE:
				setResource((Uri)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__REV_INCLUDE:
				getRevInclude().clear();
				getRevInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE:
				setResource((Uri)null);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__INCLUDE:
				getInclude().clear();
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__REV_INCLUDE:
				getRevInclude().clear();
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__RESOURCE:
				return resource != null;
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__INCLUDE:
				return include != null && !include.isEmpty();
			case FHIRPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE__REV_INCLUDE:
				return revInclude != null && !revInclude.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionTopicNotificationShapeImpl
