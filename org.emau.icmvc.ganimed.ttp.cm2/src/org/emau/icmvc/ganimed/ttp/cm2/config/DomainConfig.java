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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getQualityControl <em>Quality Control</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getPolicies <em>Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getScans <em>Scans</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig()
 * @model extendedMetaData="name='DomainConfig' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DomainConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Quality Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Control</em>' containment reference.
	 * @see #setQualityControl(QualityControlConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig_QualityControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quality-control'"
	 * @generated
	 */
	QualityControlConfig getQualityControl();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getQualityControl <em>Quality Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Control</em>' containment reference.
	 * @see #getQualityControl()
	 * @generated
	 */
	void setQualityControl(QualityControlConfig value);

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic</em>' containment reference.
	 * @see #setStatistic(StatisticConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig_Statistic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statistic'"
	 * @generated
	 */
	StatisticConfig getStatistic();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getStatistic <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic</em>' containment reference.
	 * @see #getStatistic()
	 * @generated
	 */
	void setStatistic(StatisticConfig value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference.
	 * @see #setPolicies(PoliciesConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig_Policies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policies'"
	 * @generated
	 */
	PoliciesConfig getPolicies();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getPolicies <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policies</em>' containment reference.
	 * @see #getPolicies()
	 * @generated
	 */
	void setPolicies(PoliciesConfig value);

	/**
	 * Returns the value of the '<em><b>Scans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scans</em>' containment reference.
	 * @see #setScans(ScansConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig_Scans()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scans'"
	 * @generated
	 */
	ScansConfig getScans();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getScans <em>Scans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scans</em>' containment reference.
	 * @see #getScans()
	 * @generated
	 */
	void setScans(ScansConfig value);

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference.
	 * @see #setNotifications(NotificationsConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig_Notifications()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notifications'"
	 * @generated
	 */
	NotificationsConfig getNotifications();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getNotifications <em>Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications</em>' containment reference.
	 * @see #getNotifications()
	 * @generated
	 */
	void setNotifications(NotificationsConfig value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(ApplicationConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getDomainConfig_Application()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='application'"
	 * @generated
	 */
	ApplicationConfig getApplication();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(ApplicationConfig value);

} // DomainConfig
