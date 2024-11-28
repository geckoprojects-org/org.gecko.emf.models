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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;

import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField;
import org.emau.icmvc.ganimed.ttp.cm2.config.FilterType;
import org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagination Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#isFilterFieldsAreTreatedAsConjunction <em>Filter Fields Are Treated As Conjunction</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#isFilterIsCaseSensitive <em>Filter Is Case Sensitive</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getFirstEntry <em>First Entry</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getSortField <em>Sort Field</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#isSortIsAscending <em>Sort Is Ascending</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#getTemplateType <em>Template Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl#isUseAliases <em>Use Aliases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaginationConfigImpl extends MinimalEObjectImpl.Container implements PaginationConfig {
	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType filter;

	/**
	 * The default value of the '{@link #isFilterFieldsAreTreatedAsConjunction() <em>Filter Fields Are Treated As Conjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterFieldsAreTreatedAsConjunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterFieldsAreTreatedAsConjunction() <em>Filter Fields Are Treated As Conjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterFieldsAreTreatedAsConjunction()
	 * @generated
	 * @ordered
	 */
	protected boolean filterFieldsAreTreatedAsConjunction = FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION_EDEFAULT;

	/**
	 * This is true if the Filter Fields Are Treated As Conjunction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterFieldsAreTreatedAsConjunctionESet;

	/**
	 * The default value of the '{@link #isFilterIsCaseSensitive() <em>Filter Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterIsCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_IS_CASE_SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterIsCaseSensitive() <em>Filter Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterIsCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean filterIsCaseSensitive = FILTER_IS_CASE_SENSITIVE_EDEFAULT;

	/**
	 * This is true if the Filter Is Case Sensitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterIsCaseSensitiveESet;

	/**
	 * The default value of the '{@link #getFirstEntry() <em>First Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEntry()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_ENTRY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstEntry() <em>First Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEntry()
	 * @generated
	 * @ordered
	 */
	protected int firstEntry = FIRST_ENTRY_EDEFAULT;

	/**
	 * This is true if the First Entry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstEntryESet;

	/**
	 * The default value of the '{@link #getPageSize() <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageSize() <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected int pageSize = PAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Page Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageSizeESet;

	/**
	 * The default value of the '{@link #getSortField() <em>Sort Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortField()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentField SORT_FIELD_EDEFAULT = ConsentField.NONE;

	/**
	 * The cached value of the '{@link #getSortField() <em>Sort Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortField()
	 * @generated
	 * @ordered
	 */
	protected ConsentField sortField = SORT_FIELD_EDEFAULT;

	/**
	 * This is true if the Sort Field attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortFieldESet;

	/**
	 * The default value of the '{@link #isSortIsAscending() <em>Sort Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortIsAscending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORT_IS_ASCENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSortIsAscending() <em>Sort Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortIsAscending()
	 * @generated
	 * @ordered
	 */
	protected boolean sortIsAscending = SORT_IS_ASCENDING_EDEFAULT;

	/**
	 * This is true if the Sort Is Ascending attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortIsAscendingESet;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateType() <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateType()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentTemplateType TEMPLATE_TYPE_EDEFAULT = ConsentTemplateType.CONSENT;

	/**
	 * The cached value of the '{@link #getTemplateType() <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateType()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateType templateType = TEMPLATE_TYPE_EDEFAULT;

	/**
	 * This is true if the Template Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean templateTypeESet;

	/**
	 * The default value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ALIASES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected boolean useAliases = USE_ALIASES_EDEFAULT;

	/**
	 * This is true if the Use Aliases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useAliasesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginationConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PAGINATION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		XMLGregorianCalendar oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		FilterType oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__FILTER, oldFilter, newFilter);
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
	public void setFilter(FilterType newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.PAGINATION_CONFIG__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.PAGINATION_CONFIG__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFilterFieldsAreTreatedAsConjunction() {
		return filterFieldsAreTreatedAsConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterFieldsAreTreatedAsConjunction(boolean newFilterFieldsAreTreatedAsConjunction) {
		boolean oldFilterFieldsAreTreatedAsConjunction = filterFieldsAreTreatedAsConjunction;
		filterFieldsAreTreatedAsConjunction = newFilterFieldsAreTreatedAsConjunction;
		boolean oldFilterFieldsAreTreatedAsConjunctionESet = filterFieldsAreTreatedAsConjunctionESet;
		filterFieldsAreTreatedAsConjunctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION, oldFilterFieldsAreTreatedAsConjunction, filterFieldsAreTreatedAsConjunction, !oldFilterFieldsAreTreatedAsConjunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFilterFieldsAreTreatedAsConjunction() {
		boolean oldFilterFieldsAreTreatedAsConjunction = filterFieldsAreTreatedAsConjunction;
		boolean oldFilterFieldsAreTreatedAsConjunctionESet = filterFieldsAreTreatedAsConjunctionESet;
		filterFieldsAreTreatedAsConjunction = FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION_EDEFAULT;
		filterFieldsAreTreatedAsConjunctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION, oldFilterFieldsAreTreatedAsConjunction, FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION_EDEFAULT, oldFilterFieldsAreTreatedAsConjunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFilterFieldsAreTreatedAsConjunction() {
		return filterFieldsAreTreatedAsConjunctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFilterIsCaseSensitive() {
		return filterIsCaseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterIsCaseSensitive(boolean newFilterIsCaseSensitive) {
		boolean oldFilterIsCaseSensitive = filterIsCaseSensitive;
		filterIsCaseSensitive = newFilterIsCaseSensitive;
		boolean oldFilterIsCaseSensitiveESet = filterIsCaseSensitiveESet;
		filterIsCaseSensitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE, oldFilterIsCaseSensitive, filterIsCaseSensitive, !oldFilterIsCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFilterIsCaseSensitive() {
		boolean oldFilterIsCaseSensitive = filterIsCaseSensitive;
		boolean oldFilterIsCaseSensitiveESet = filterIsCaseSensitiveESet;
		filterIsCaseSensitive = FILTER_IS_CASE_SENSITIVE_EDEFAULT;
		filterIsCaseSensitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE, oldFilterIsCaseSensitive, FILTER_IS_CASE_SENSITIVE_EDEFAULT, oldFilterIsCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFilterIsCaseSensitive() {
		return filterIsCaseSensitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFirstEntry() {
		return firstEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstEntry(int newFirstEntry) {
		int oldFirstEntry = firstEntry;
		firstEntry = newFirstEntry;
		boolean oldFirstEntryESet = firstEntryESet;
		firstEntryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__FIRST_ENTRY, oldFirstEntry, firstEntry, !oldFirstEntryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstEntry() {
		int oldFirstEntry = firstEntry;
		boolean oldFirstEntryESet = firstEntryESet;
		firstEntry = FIRST_ENTRY_EDEFAULT;
		firstEntryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__FIRST_ENTRY, oldFirstEntry, FIRST_ENTRY_EDEFAULT, oldFirstEntryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstEntry() {
		return firstEntryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageSize(int newPageSize) {
		int oldPageSize = pageSize;
		pageSize = newPageSize;
		boolean oldPageSizeESet = pageSizeESet;
		pageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__PAGE_SIZE, oldPageSize, pageSize, !oldPageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPageSize() {
		int oldPageSize = pageSize;
		boolean oldPageSizeESet = pageSizeESet;
		pageSize = PAGE_SIZE_EDEFAULT;
		pageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__PAGE_SIZE, oldPageSize, PAGE_SIZE_EDEFAULT, oldPageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPageSize() {
		return pageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentField getSortField() {
		return sortField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortField(ConsentField newSortField) {
		ConsentField oldSortField = sortField;
		sortField = newSortField == null ? SORT_FIELD_EDEFAULT : newSortField;
		boolean oldSortFieldESet = sortFieldESet;
		sortFieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__SORT_FIELD, oldSortField, sortField, !oldSortFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSortField() {
		ConsentField oldSortField = sortField;
		boolean oldSortFieldESet = sortFieldESet;
		sortField = SORT_FIELD_EDEFAULT;
		sortFieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__SORT_FIELD, oldSortField, SORT_FIELD_EDEFAULT, oldSortFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSortField() {
		return sortFieldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSortIsAscending() {
		return sortIsAscending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortIsAscending(boolean newSortIsAscending) {
		boolean oldSortIsAscending = sortIsAscending;
		sortIsAscending = newSortIsAscending;
		boolean oldSortIsAscendingESet = sortIsAscendingESet;
		sortIsAscendingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__SORT_IS_ASCENDING, oldSortIsAscending, sortIsAscending, !oldSortIsAscendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSortIsAscending() {
		boolean oldSortIsAscending = sortIsAscending;
		boolean oldSortIsAscendingESet = sortIsAscendingESet;
		sortIsAscending = SORT_IS_ASCENDING_EDEFAULT;
		sortIsAscendingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__SORT_IS_ASCENDING, oldSortIsAscending, SORT_IS_ASCENDING_EDEFAULT, oldSortIsAscendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSortIsAscending() {
		return sortIsAscendingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateType getTemplateType() {
		return templateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateType(ConsentTemplateType newTemplateType) {
		ConsentTemplateType oldTemplateType = templateType;
		templateType = newTemplateType == null ? TEMPLATE_TYPE_EDEFAULT : newTemplateType;
		boolean oldTemplateTypeESet = templateTypeESet;
		templateTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__TEMPLATE_TYPE, oldTemplateType, templateType, !oldTemplateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTemplateType() {
		ConsentTemplateType oldTemplateType = templateType;
		boolean oldTemplateTypeESet = templateTypeESet;
		templateType = TEMPLATE_TYPE_EDEFAULT;
		templateTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__TEMPLATE_TYPE, oldTemplateType, TEMPLATE_TYPE_EDEFAULT, oldTemplateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTemplateType() {
		return templateTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAliases() {
		return useAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAliases(boolean newUseAliases) {
		boolean oldUseAliases = useAliases;
		useAliases = newUseAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PAGINATION_CONFIG__USE_ALIASES, oldUseAliases, useAliases, !oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseAliases() {
		boolean oldUseAliases = useAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliases = USE_ALIASES_EDEFAULT;
		useAliasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.PAGINATION_CONFIG__USE_ALIASES, oldUseAliases, USE_ALIASES_EDEFAULT, oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseAliases() {
		return useAliasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.PAGINATION_CONFIG__FILTER:
				return basicSetFilter(null, msgs);
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
			case ConfigPackage.PAGINATION_CONFIG__END_DATE:
				return getEndDate();
			case ConfigPackage.PAGINATION_CONFIG__FILTER:
				return getFilter();
			case ConfigPackage.PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION:
				return isFilterFieldsAreTreatedAsConjunction();
			case ConfigPackage.PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE:
				return isFilterIsCaseSensitive();
			case ConfigPackage.PAGINATION_CONFIG__FIRST_ENTRY:
				return getFirstEntry();
			case ConfigPackage.PAGINATION_CONFIG__PAGE_SIZE:
				return getPageSize();
			case ConfigPackage.PAGINATION_CONFIG__SORT_FIELD:
				return getSortField();
			case ConfigPackage.PAGINATION_CONFIG__SORT_IS_ASCENDING:
				return isSortIsAscending();
			case ConfigPackage.PAGINATION_CONFIG__START_DATE:
				return getStartDate();
			case ConfigPackage.PAGINATION_CONFIG__TEMPLATE_TYPE:
				return getTemplateType();
			case ConfigPackage.PAGINATION_CONFIG__USE_ALIASES:
				return isUseAliases();
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
			case ConfigPackage.PAGINATION_CONFIG__END_DATE:
				setEndDate((XMLGregorianCalendar)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__FILTER:
				setFilter((FilterType)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION:
				setFilterFieldsAreTreatedAsConjunction((Boolean)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE:
				setFilterIsCaseSensitive((Boolean)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__FIRST_ENTRY:
				setFirstEntry((Integer)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__PAGE_SIZE:
				setPageSize((Integer)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__SORT_FIELD:
				setSortField((ConsentField)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__SORT_IS_ASCENDING:
				setSortIsAscending((Boolean)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__TEMPLATE_TYPE:
				setTemplateType((ConsentTemplateType)newValue);
				return;
			case ConfigPackage.PAGINATION_CONFIG__USE_ALIASES:
				setUseAliases((Boolean)newValue);
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
			case ConfigPackage.PAGINATION_CONFIG__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ConfigPackage.PAGINATION_CONFIG__FILTER:
				setFilter((FilterType)null);
				return;
			case ConfigPackage.PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION:
				unsetFilterFieldsAreTreatedAsConjunction();
				return;
			case ConfigPackage.PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE:
				unsetFilterIsCaseSensitive();
				return;
			case ConfigPackage.PAGINATION_CONFIG__FIRST_ENTRY:
				unsetFirstEntry();
				return;
			case ConfigPackage.PAGINATION_CONFIG__PAGE_SIZE:
				unsetPageSize();
				return;
			case ConfigPackage.PAGINATION_CONFIG__SORT_FIELD:
				unsetSortField();
				return;
			case ConfigPackage.PAGINATION_CONFIG__SORT_IS_ASCENDING:
				unsetSortIsAscending();
				return;
			case ConfigPackage.PAGINATION_CONFIG__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ConfigPackage.PAGINATION_CONFIG__TEMPLATE_TYPE:
				unsetTemplateType();
				return;
			case ConfigPackage.PAGINATION_CONFIG__USE_ALIASES:
				unsetUseAliases();
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
			case ConfigPackage.PAGINATION_CONFIG__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ConfigPackage.PAGINATION_CONFIG__FILTER:
				return filter != null;
			case ConfigPackage.PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION:
				return isSetFilterFieldsAreTreatedAsConjunction();
			case ConfigPackage.PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE:
				return isSetFilterIsCaseSensitive();
			case ConfigPackage.PAGINATION_CONFIG__FIRST_ENTRY:
				return isSetFirstEntry();
			case ConfigPackage.PAGINATION_CONFIG__PAGE_SIZE:
				return isSetPageSize();
			case ConfigPackage.PAGINATION_CONFIG__SORT_FIELD:
				return isSetSortField();
			case ConfigPackage.PAGINATION_CONFIG__SORT_IS_ASCENDING:
				return isSetSortIsAscending();
			case ConfigPackage.PAGINATION_CONFIG__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ConfigPackage.PAGINATION_CONFIG__TEMPLATE_TYPE:
				return isSetTemplateType();
			case ConfigPackage.PAGINATION_CONFIG__USE_ALIASES:
				return isSetUseAliases();
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
		result.append(" (endDate: ");
		result.append(endDate);
		result.append(", filterFieldsAreTreatedAsConjunction: ");
		if (filterFieldsAreTreatedAsConjunctionESet) result.append(filterFieldsAreTreatedAsConjunction); else result.append("<unset>");
		result.append(", filterIsCaseSensitive: ");
		if (filterIsCaseSensitiveESet) result.append(filterIsCaseSensitive); else result.append("<unset>");
		result.append(", firstEntry: ");
		if (firstEntryESet) result.append(firstEntry); else result.append("<unset>");
		result.append(", pageSize: ");
		if (pageSizeESet) result.append(pageSize); else result.append("<unset>");
		result.append(", sortField: ");
		if (sortFieldESet) result.append(sortField); else result.append("<unset>");
		result.append(", sortIsAscending: ");
		if (sortIsAscendingESet) result.append(sortIsAscending); else result.append("<unset>");
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", templateType: ");
		if (templateTypeESet) result.append(templateType); else result.append("<unset>");
		result.append(", useAliases: ");
		if (useAliasesESet) result.append(useAliases); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PaginationConfigImpl
