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
 * A representation of the model object '<em><b>Policies Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isPermanentRevoke <em>Permanent Revoke</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeHighestVersionInsteadOfNewest <em>Take Highest Version Instead Of Newest</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeMostSpecificValidityInsteadOfShortest <em>Take Most Specific Validity Instead Of Shortest</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPoliciesConfig()
 * @model extendedMetaData="name='PoliciesConfig' kind='empty'"
 * @generated
 */
@ProviderType
public interface PoliciesConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Permanent Revoke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permanent Revoke</em>' attribute.
	 * @see #isSetPermanentRevoke()
	 * @see #unsetPermanentRevoke()
	 * @see #setPermanentRevoke(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPoliciesConfig_PermanentRevoke()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='permanent-revoke'"
	 * @generated
	 */
	boolean isPermanentRevoke();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isPermanentRevoke <em>Permanent Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permanent Revoke</em>' attribute.
	 * @see #isSetPermanentRevoke()
	 * @see #unsetPermanentRevoke()
	 * @see #isPermanentRevoke()
	 * @generated
	 */
	void setPermanentRevoke(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isPermanentRevoke <em>Permanent Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermanentRevoke()
	 * @see #isPermanentRevoke()
	 * @see #setPermanentRevoke(boolean)
	 * @generated
	 */
	void unsetPermanentRevoke();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isPermanentRevoke <em>Permanent Revoke</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permanent Revoke</em>' attribute is set.
	 * @see #unsetPermanentRevoke()
	 * @see #isPermanentRevoke()
	 * @see #setPermanentRevoke(boolean)
	 * @generated
	 */
	boolean isSetPermanentRevoke();

	/**
	 * Returns the value of the '<em><b>Take Highest Version Instead Of Newest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Take Highest Version Instead Of Newest</em>' attribute.
	 * @see #isSetTakeHighestVersionInsteadOfNewest()
	 * @see #unsetTakeHighestVersionInsteadOfNewest()
	 * @see #setTakeHighestVersionInsteadOfNewest(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPoliciesConfig_TakeHighestVersionInsteadOfNewest()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='take-highest-version-instead-of-newest'"
	 * @generated
	 */
	boolean isTakeHighestVersionInsteadOfNewest();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeHighestVersionInsteadOfNewest <em>Take Highest Version Instead Of Newest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Highest Version Instead Of Newest</em>' attribute.
	 * @see #isSetTakeHighestVersionInsteadOfNewest()
	 * @see #unsetTakeHighestVersionInsteadOfNewest()
	 * @see #isTakeHighestVersionInsteadOfNewest()
	 * @generated
	 */
	void setTakeHighestVersionInsteadOfNewest(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeHighestVersionInsteadOfNewest <em>Take Highest Version Instead Of Newest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTakeHighestVersionInsteadOfNewest()
	 * @see #isTakeHighestVersionInsteadOfNewest()
	 * @see #setTakeHighestVersionInsteadOfNewest(boolean)
	 * @generated
	 */
	void unsetTakeHighestVersionInsteadOfNewest();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeHighestVersionInsteadOfNewest <em>Take Highest Version Instead Of Newest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Take Highest Version Instead Of Newest</em>' attribute is set.
	 * @see #unsetTakeHighestVersionInsteadOfNewest()
	 * @see #isTakeHighestVersionInsteadOfNewest()
	 * @see #setTakeHighestVersionInsteadOfNewest(boolean)
	 * @generated
	 */
	boolean isSetTakeHighestVersionInsteadOfNewest();

	/**
	 * Returns the value of the '<em><b>Take Most Specific Validity Instead Of Shortest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Take Most Specific Validity Instead Of Shortest</em>' attribute.
	 * @see #isSetTakeMostSpecificValidityInsteadOfShortest()
	 * @see #unsetTakeMostSpecificValidityInsteadOfShortest()
	 * @see #setTakeMostSpecificValidityInsteadOfShortest(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPoliciesConfig_TakeMostSpecificValidityInsteadOfShortest()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='take-most-specific-validity-instead-of-shortest'"
	 * @generated
	 */
	boolean isTakeMostSpecificValidityInsteadOfShortest();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeMostSpecificValidityInsteadOfShortest <em>Take Most Specific Validity Instead Of Shortest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Most Specific Validity Instead Of Shortest</em>' attribute.
	 * @see #isSetTakeMostSpecificValidityInsteadOfShortest()
	 * @see #unsetTakeMostSpecificValidityInsteadOfShortest()
	 * @see #isTakeMostSpecificValidityInsteadOfShortest()
	 * @generated
	 */
	void setTakeMostSpecificValidityInsteadOfShortest(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeMostSpecificValidityInsteadOfShortest <em>Take Most Specific Validity Instead Of Shortest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTakeMostSpecificValidityInsteadOfShortest()
	 * @see #isTakeMostSpecificValidityInsteadOfShortest()
	 * @see #setTakeMostSpecificValidityInsteadOfShortest(boolean)
	 * @generated
	 */
	void unsetTakeMostSpecificValidityInsteadOfShortest();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeMostSpecificValidityInsteadOfShortest <em>Take Most Specific Validity Instead Of Shortest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Take Most Specific Validity Instead Of Shortest</em>' attribute is set.
	 * @see #unsetTakeMostSpecificValidityInsteadOfShortest()
	 * @see #isTakeMostSpecificValidityInsteadOfShortest()
	 * @see #setTakeMostSpecificValidityInsteadOfShortest(boolean)
	 * @generated
	 */
	boolean isSetTakeMostSpecificValidityInsteadOfShortest();

} // PoliciesConfig
