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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagination Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterFieldsAreTreatedAsConjunction <em>Filter Fields Are Treated As Conjunction</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterIsCaseSensitive <em>Filter Is Case Sensitive</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFirstEntry <em>First Entry</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getSortField <em>Sort Field</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isSortIsAscending <em>Sort Is Ascending</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getTemplateType <em>Template Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isUseAliases <em>Use Aliases</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig()
 * @model extendedMetaData="name='paginationConfig' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PaginationConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_EndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='endDate'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_Filter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter Fields Are Treated As Conjunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Fields Are Treated As Conjunction</em>' attribute.
	 * @see #isSetFilterFieldsAreTreatedAsConjunction()
	 * @see #unsetFilterFieldsAreTreatedAsConjunction()
	 * @see #setFilterFieldsAreTreatedAsConjunction(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_FilterFieldsAreTreatedAsConjunction()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='filterFieldsAreTreatedAsConjunction'"
	 * @generated
	 */
	boolean isFilterFieldsAreTreatedAsConjunction();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterFieldsAreTreatedAsConjunction <em>Filter Fields Are Treated As Conjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Fields Are Treated As Conjunction</em>' attribute.
	 * @see #isSetFilterFieldsAreTreatedAsConjunction()
	 * @see #unsetFilterFieldsAreTreatedAsConjunction()
	 * @see #isFilterFieldsAreTreatedAsConjunction()
	 * @generated
	 */
	void setFilterFieldsAreTreatedAsConjunction(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterFieldsAreTreatedAsConjunction <em>Filter Fields Are Treated As Conjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterFieldsAreTreatedAsConjunction()
	 * @see #isFilterFieldsAreTreatedAsConjunction()
	 * @see #setFilterFieldsAreTreatedAsConjunction(boolean)
	 * @generated
	 */
	void unsetFilterFieldsAreTreatedAsConjunction();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterFieldsAreTreatedAsConjunction <em>Filter Fields Are Treated As Conjunction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Fields Are Treated As Conjunction</em>' attribute is set.
	 * @see #unsetFilterFieldsAreTreatedAsConjunction()
	 * @see #isFilterFieldsAreTreatedAsConjunction()
	 * @see #setFilterFieldsAreTreatedAsConjunction(boolean)
	 * @generated
	 */
	boolean isSetFilterFieldsAreTreatedAsConjunction();

	/**
	 * Returns the value of the '<em><b>Filter Is Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Is Case Sensitive</em>' attribute.
	 * @see #isSetFilterIsCaseSensitive()
	 * @see #unsetFilterIsCaseSensitive()
	 * @see #setFilterIsCaseSensitive(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_FilterIsCaseSensitive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='filterIsCaseSensitive'"
	 * @generated
	 */
	boolean isFilterIsCaseSensitive();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterIsCaseSensitive <em>Filter Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Is Case Sensitive</em>' attribute.
	 * @see #isSetFilterIsCaseSensitive()
	 * @see #unsetFilterIsCaseSensitive()
	 * @see #isFilterIsCaseSensitive()
	 * @generated
	 */
	void setFilterIsCaseSensitive(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterIsCaseSensitive <em>Filter Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterIsCaseSensitive()
	 * @see #isFilterIsCaseSensitive()
	 * @see #setFilterIsCaseSensitive(boolean)
	 * @generated
	 */
	void unsetFilterIsCaseSensitive();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterIsCaseSensitive <em>Filter Is Case Sensitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Is Case Sensitive</em>' attribute is set.
	 * @see #unsetFilterIsCaseSensitive()
	 * @see #isFilterIsCaseSensitive()
	 * @see #setFilterIsCaseSensitive(boolean)
	 * @generated
	 */
	boolean isSetFilterIsCaseSensitive();

	/**
	 * Returns the value of the '<em><b>First Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Entry</em>' attribute.
	 * @see #isSetFirstEntry()
	 * @see #unsetFirstEntry()
	 * @see #setFirstEntry(int)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_FirstEntry()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='firstEntry'"
	 * @generated
	 */
	int getFirstEntry();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFirstEntry <em>First Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Entry</em>' attribute.
	 * @see #isSetFirstEntry()
	 * @see #unsetFirstEntry()
	 * @see #getFirstEntry()
	 * @generated
	 */
	void setFirstEntry(int value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFirstEntry <em>First Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstEntry()
	 * @see #getFirstEntry()
	 * @see #setFirstEntry(int)
	 * @generated
	 */
	void unsetFirstEntry();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFirstEntry <em>First Entry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Entry</em>' attribute is set.
	 * @see #unsetFirstEntry()
	 * @see #getFirstEntry()
	 * @see #setFirstEntry(int)
	 * @generated
	 */
	boolean isSetFirstEntry();

	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #isSetPageSize()
	 * @see #unsetPageSize()
	 * @see #setPageSize(int)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_PageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='pageSize'"
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #isSetPageSize()
	 * @see #unsetPageSize()
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageSize()
	 * @see #getPageSize()
	 * @see #setPageSize(int)
	 * @generated
	 */
	void unsetPageSize();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getPageSize <em>Page Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Size</em>' attribute is set.
	 * @see #unsetPageSize()
	 * @see #getPageSize()
	 * @see #setPageSize(int)
	 * @generated
	 */
	boolean isSetPageSize();

	/**
	 * Returns the value of the '<em><b>Sort Field</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Field</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @see #isSetSortField()
	 * @see #unsetSortField()
	 * @see #setSortField(ConsentField)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_SortField()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sortField'"
	 * @generated
	 */
	ConsentField getSortField();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getSortField <em>Sort Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Field</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @see #isSetSortField()
	 * @see #unsetSortField()
	 * @see #getSortField()
	 * @generated
	 */
	void setSortField(ConsentField value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getSortField <em>Sort Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortField()
	 * @see #getSortField()
	 * @see #setSortField(ConsentField)
	 * @generated
	 */
	void unsetSortField();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getSortField <em>Sort Field</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Field</em>' attribute is set.
	 * @see #unsetSortField()
	 * @see #getSortField()
	 * @see #setSortField(ConsentField)
	 * @generated
	 */
	boolean isSetSortField();

	/**
	 * Returns the value of the '<em><b>Sort Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Is Ascending</em>' attribute.
	 * @see #isSetSortIsAscending()
	 * @see #unsetSortIsAscending()
	 * @see #setSortIsAscending(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_SortIsAscending()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='sortIsAscending'"
	 * @generated
	 */
	boolean isSortIsAscending();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isSortIsAscending <em>Sort Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Is Ascending</em>' attribute.
	 * @see #isSetSortIsAscending()
	 * @see #unsetSortIsAscending()
	 * @see #isSortIsAscending()
	 * @generated
	 */
	void setSortIsAscending(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isSortIsAscending <em>Sort Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortIsAscending()
	 * @see #isSortIsAscending()
	 * @see #setSortIsAscending(boolean)
	 * @generated
	 */
	void unsetSortIsAscending();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isSortIsAscending <em>Sort Is Ascending</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Is Ascending</em>' attribute is set.
	 * @see #unsetSortIsAscending()
	 * @see #isSortIsAscending()
	 * @see #setSortIsAscending(boolean)
	 * @generated
	 */
	boolean isSetSortIsAscending();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='startDate'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Template Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see #isSetTemplateType()
	 * @see #unsetTemplateType()
	 * @see #setTemplateType(ConsentTemplateType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_TemplateType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='templateType'"
	 * @generated
	 */
	ConsentTemplateType getTemplateType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getTemplateType <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see #isSetTemplateType()
	 * @see #unsetTemplateType()
	 * @see #getTemplateType()
	 * @generated
	 */
	void setTemplateType(ConsentTemplateType value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getTemplateType <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemplateType()
	 * @see #getTemplateType()
	 * @see #setTemplateType(ConsentTemplateType)
	 * @generated
	 */
	void unsetTemplateType();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getTemplateType <em>Template Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Template Type</em>' attribute is set.
	 * @see #unsetTemplateType()
	 * @see #getTemplateType()
	 * @see #setTemplateType(ConsentTemplateType)
	 * @generated
	 */
	boolean isSetTemplateType();

	/**
	 * Returns the value of the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #setUseAliases(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getPaginationConfig_UseAliases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='useAliases'"
	 * @generated
	 */
	boolean isUseAliases();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @generated
	 */
	void setUseAliases(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	void unsetUseAliases();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isUseAliases <em>Use Aliases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Aliases</em>' attribute is set.
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	boolean isSetUseAliases();

} // PaginationConfig
