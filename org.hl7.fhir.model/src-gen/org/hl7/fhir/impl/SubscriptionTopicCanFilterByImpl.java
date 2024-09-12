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
import org.hl7.fhir.Markdown;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SubscriptionTopicCanFilterBy;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Topic Can Filter By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicCanFilterByImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicCanFilterByImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicCanFilterByImpl#getFilterParameter <em>Filter Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicCanFilterByImpl#getFilterDefinition <em>Filter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicCanFilterByImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionTopicCanFilterByImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionTopicCanFilterByImpl extends BackboneElementImpl implements SubscriptionTopicCanFilterBy {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

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
	 * The cached value of the '{@link #getFilterParameter() <em>Filter Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterParameter()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String filterParameter;

	/**
	 * The cached value of the '{@link #getFilterDefinition() <em>Filter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri filterDefinition;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchComparator> comparator;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchModifierCode> modifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionTopicCanFilterByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubscriptionTopicCanFilterBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE, oldResource, newResource);
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
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getFilterParameter() {
		return filterParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterParameter(org.hl7.fhir.String newFilterParameter, NotificationChain msgs) {
		org.hl7.fhir.String oldFilterParameter = filterParameter;
		filterParameter = newFilterParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER, oldFilterParameter, newFilterParameter);
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
	public void setFilterParameter(org.hl7.fhir.String newFilterParameter) {
		if (newFilterParameter != filterParameter) {
			NotificationChain msgs = null;
			if (filterParameter != null)
				msgs = ((InternalEObject)filterParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER, null, msgs);
			if (newFilterParameter != null)
				msgs = ((InternalEObject)newFilterParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER, null, msgs);
			msgs = basicSetFilterParameter(newFilterParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER, newFilterParameter, newFilterParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getFilterDefinition() {
		return filterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterDefinition(Uri newFilterDefinition, NotificationChain msgs) {
		Uri oldFilterDefinition = filterDefinition;
		filterDefinition = newFilterDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION, oldFilterDefinition, newFilterDefinition);
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
	public void setFilterDefinition(Uri newFilterDefinition) {
		if (newFilterDefinition != filterDefinition) {
			NotificationChain msgs = null;
			if (filterDefinition != null)
				msgs = ((InternalEObject)filterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION, null, msgs);
			if (newFilterDefinition != null)
				msgs = ((InternalEObject)newFilterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION, null, msgs);
			msgs = basicSetFilterDefinition(newFilterDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION, newFilterDefinition, newFilterDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchComparator> getComparator() {
		if (comparator == null) {
			comparator = new EObjectContainmentEList<SearchComparator>(SearchComparator.class, this, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__COMPARATOR);
		}
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchModifierCode> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<SearchModifierCode>(SearchModifierCode.class, this, FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE:
				return basicSetResource(null, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER:
				return basicSetFilterParameter(null, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION:
				return basicSetFilterDefinition(null, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__COMPARATOR:
				return ((InternalEList<?>)getComparator()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION:
				return getDescription();
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE:
				return getResource();
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER:
				return getFilterParameter();
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION:
				return getFilterDefinition();
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__COMPARATOR:
				return getComparator();
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__MODIFIER:
				return getModifier();
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE:
				setResource((Uri)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER:
				setFilterParameter((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION:
				setFilterDefinition((Uri)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__COMPARATOR:
				getComparator().clear();
				getComparator().addAll((Collection<? extends SearchComparator>)newValue);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends SearchModifierCode>)newValue);
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE:
				setResource((Uri)null);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER:
				setFilterParameter((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION:
				setFilterDefinition((Uri)null);
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__COMPARATOR:
				getComparator().clear();
				return;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__MODIFIER:
				getModifier().clear();
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
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__DESCRIPTION:
				return description != null;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__RESOURCE:
				return resource != null;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_PARAMETER:
				return filterParameter != null;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__FILTER_DEFINITION:
				return filterDefinition != null;
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__COMPARATOR:
				return comparator != null && !comparator.isEmpty();
			case FHIRPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY__MODIFIER:
				return modifier != null && !modifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionTopicCanFilterByImpl
