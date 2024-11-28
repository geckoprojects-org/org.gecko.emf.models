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
package org.emau.icmvc.ganimed.ttp.cm2.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl#getQualityControl <em>Quality Control</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl#getScans <em>Scans</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainConfigImpl extends MinimalEObjectImpl.Container implements DomainConfig {
	/**
	 * The cached value of the '{@link #getQualityControl() <em>Quality Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityControl()
	 * @generated
	 * @ordered
	 */
	protected QualityControlConfig qualityControl;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected StatisticConfig statistic;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected PoliciesConfig policies;

	/**
	 * The cached value of the '{@link #getScans() <em>Scans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScans()
	 * @generated
	 * @ordered
	 */
	protected ScansConfig scans;

	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected NotificationsConfig notifications;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected ApplicationConfig application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.DOMAIN_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityControlConfig getQualityControl() {
		return qualityControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityControl(QualityControlConfig newQualityControl, NotificationChain msgs) {
		QualityControlConfig oldQualityControl = qualityControl;
		qualityControl = newQualityControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL, oldQualityControl, newQualityControl);
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
	public void setQualityControl(QualityControlConfig newQualityControl) {
		if (newQualityControl != qualityControl) {
			NotificationChain msgs = null;
			if (qualityControl != null)
				msgs = ((InternalEObject)qualityControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL, null, msgs);
			if (newQualityControl != null)
				msgs = ((InternalEObject)newQualityControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL, null, msgs);
			msgs = basicSetQualityControl(newQualityControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL, newQualityControl, newQualityControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticConfig getStatistic() {
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistic(StatisticConfig newStatistic, NotificationChain msgs) {
		StatisticConfig oldStatistic = statistic;
		statistic = newStatistic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__STATISTIC, oldStatistic, newStatistic);
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
	public void setStatistic(StatisticConfig newStatistic) {
		if (newStatistic != statistic) {
			NotificationChain msgs = null;
			if (statistic != null)
				msgs = ((InternalEObject)statistic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__STATISTIC, null, msgs);
			if (newStatistic != null)
				msgs = ((InternalEObject)newStatistic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__STATISTIC, null, msgs);
			msgs = basicSetStatistic(newStatistic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__STATISTIC, newStatistic, newStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoliciesConfig getPolicies() {
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicies(PoliciesConfig newPolicies, NotificationChain msgs) {
		PoliciesConfig oldPolicies = policies;
		policies = newPolicies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__POLICIES, oldPolicies, newPolicies);
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
	public void setPolicies(PoliciesConfig newPolicies) {
		if (newPolicies != policies) {
			NotificationChain msgs = null;
			if (policies != null)
				msgs = ((InternalEObject)policies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__POLICIES, null, msgs);
			if (newPolicies != null)
				msgs = ((InternalEObject)newPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__POLICIES, null, msgs);
			msgs = basicSetPolicies(newPolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__POLICIES, newPolicies, newPolicies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScansConfig getScans() {
		return scans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScans(ScansConfig newScans, NotificationChain msgs) {
		ScansConfig oldScans = scans;
		scans = newScans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__SCANS, oldScans, newScans);
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
	public void setScans(ScansConfig newScans) {
		if (newScans != scans) {
			NotificationChain msgs = null;
			if (scans != null)
				msgs = ((InternalEObject)scans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__SCANS, null, msgs);
			if (newScans != null)
				msgs = ((InternalEObject)newScans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__SCANS, null, msgs);
			msgs = basicSetScans(newScans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__SCANS, newScans, newScans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationsConfig getNotifications() {
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotifications(NotificationsConfig newNotifications, NotificationChain msgs) {
		NotificationsConfig oldNotifications = notifications;
		notifications = newNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS, oldNotifications, newNotifications);
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
	public void setNotifications(NotificationsConfig newNotifications) {
		if (newNotifications != notifications) {
			NotificationChain msgs = null;
			if (notifications != null)
				msgs = ((InternalEObject)notifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS, null, msgs);
			if (newNotifications != null)
				msgs = ((InternalEObject)newNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS, null, msgs);
			msgs = basicSetNotifications(newNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS, newNotifications, newNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationConfig getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(ApplicationConfig newApplication, NotificationChain msgs) {
		ApplicationConfig oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__APPLICATION, oldApplication, newApplication);
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
	public void setApplication(ApplicationConfig newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__APPLICATION, null, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.DOMAIN_CONFIG__APPLICATION, null, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOMAIN_CONFIG__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL:
				return basicSetQualityControl(null, msgs);
			case ConfigPackage.DOMAIN_CONFIG__STATISTIC:
				return basicSetStatistic(null, msgs);
			case ConfigPackage.DOMAIN_CONFIG__POLICIES:
				return basicSetPolicies(null, msgs);
			case ConfigPackage.DOMAIN_CONFIG__SCANS:
				return basicSetScans(null, msgs);
			case ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS:
				return basicSetNotifications(null, msgs);
			case ConfigPackage.DOMAIN_CONFIG__APPLICATION:
				return basicSetApplication(null, msgs);
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
			case ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL:
				return getQualityControl();
			case ConfigPackage.DOMAIN_CONFIG__STATISTIC:
				return getStatistic();
			case ConfigPackage.DOMAIN_CONFIG__POLICIES:
				return getPolicies();
			case ConfigPackage.DOMAIN_CONFIG__SCANS:
				return getScans();
			case ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS:
				return getNotifications();
			case ConfigPackage.DOMAIN_CONFIG__APPLICATION:
				return getApplication();
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
			case ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL:
				setQualityControl((QualityControlConfig)newValue);
				return;
			case ConfigPackage.DOMAIN_CONFIG__STATISTIC:
				setStatistic((StatisticConfig)newValue);
				return;
			case ConfigPackage.DOMAIN_CONFIG__POLICIES:
				setPolicies((PoliciesConfig)newValue);
				return;
			case ConfigPackage.DOMAIN_CONFIG__SCANS:
				setScans((ScansConfig)newValue);
				return;
			case ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS:
				setNotifications((NotificationsConfig)newValue);
				return;
			case ConfigPackage.DOMAIN_CONFIG__APPLICATION:
				setApplication((ApplicationConfig)newValue);
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
			case ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL:
				setQualityControl((QualityControlConfig)null);
				return;
			case ConfigPackage.DOMAIN_CONFIG__STATISTIC:
				setStatistic((StatisticConfig)null);
				return;
			case ConfigPackage.DOMAIN_CONFIG__POLICIES:
				setPolicies((PoliciesConfig)null);
				return;
			case ConfigPackage.DOMAIN_CONFIG__SCANS:
				setScans((ScansConfig)null);
				return;
			case ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS:
				setNotifications((NotificationsConfig)null);
				return;
			case ConfigPackage.DOMAIN_CONFIG__APPLICATION:
				setApplication((ApplicationConfig)null);
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
			case ConfigPackage.DOMAIN_CONFIG__QUALITY_CONTROL:
				return qualityControl != null;
			case ConfigPackage.DOMAIN_CONFIG__STATISTIC:
				return statistic != null;
			case ConfigPackage.DOMAIN_CONFIG__POLICIES:
				return policies != null;
			case ConfigPackage.DOMAIN_CONFIG__SCANS:
				return scans != null;
			case ConfigPackage.DOMAIN_CONFIG__NOTIFICATIONS:
				return notifications != null;
			case ConfigPackage.DOMAIN_CONFIG__APPLICATION:
				return application != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainConfigImpl
