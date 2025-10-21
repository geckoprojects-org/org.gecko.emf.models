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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CenterPointType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CloseType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ColorType2;
import de.online.adv.namespaces.adv.sk.xml.skadv.CompositeGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CurrentStepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType;
import de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType;
import de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot;
import de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.EveryType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.FillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.FontType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.ForType;
import de.online.adv.namespaces.adv.sk.xml.skadv.GapType;
import de.online.adv.namespaces.adv.sk.xml.skadv.GraphicFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3;
import de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillLongestSideType;
import de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesLongestSideType;
import de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType;
import de.online.adv.namespaces.adv.sk.xml.skadv.IfType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3;
import de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.LineGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LinetoType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LiteralType;
import de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringType;
import de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentSurfaceType;
import de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType;
import de.online.adv.namespaces.adv.sk.xml.skadv.MovetoType;
import de.online.adv.namespaces.adv.sk.xml.skadv.NullColorType;
import de.online.adv.namespaces.adv.sk.xml.skadv.NullSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.OperationType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PathElementType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PathType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PlacementRuleType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PointSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RuleType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SelfStepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SimpleGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SkeletonLineType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidStrokeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SomeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5;
import de.online.adv.namespaces.adv.sk.xml.skadv.StyleType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TagSetType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TagType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TextGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TextSectionType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TubeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.VariableType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getAdditionalSymbolizers <em>Additional Symbolizers</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getAreaGraphic <em>Area Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSimpleGraphic <em>Simple Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getAreaSymbolizer <em>Area Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPureSymbolizer <em>Pure Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSymbolizer <em>Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getBoundingBoxPoint <em>Bounding Box Point</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPlacementRule <em>Placement Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCenterPoint <em>Center Point</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCircularArc <em>Circular Arc</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPathElement <em>Path Element</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getClose <em>Close</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getColorCMYK <em>Color CMYK</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getColorRGB <em>Color RGB</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCompositeGraphic <em>Composite Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCompoundStroke <em>Compound Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCompoundStrokeSection <em>Compound Stroke Section</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCurrentStep <em>Current Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getCurveto <em>Curveto</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getDashedStroke <em>Dashed Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSolidOrDashedStroke <em>Solid Or Dashed Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getDesignRule <em>Design Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getDisplacement <em>Displacement</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getEmit <em>Emit</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getEvery <em>Every</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFeatureTypeStep <em>Feature Type Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFilteredSymbolizer <em>Filtered Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFont <em>Font</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getFor <em>For</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getGap <em>Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getGraphicFill <em>Graphic Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getHalo <em>Halo</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getHatchFill <em>Hatch Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getHatchFillLongestSide <em>Hatch Fill Longest Side</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getHatchLines <em>Hatch Lines</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getHatchLinesLongestSide <em>Hatch Lines Longest Side</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getIf <em>If</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLineGraphic <em>Line Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLineLabel <em>Line Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLinePlacedGraphic <em>Line Placed Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLineSymbolizer <em>Line Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLineto <em>Lineto</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getMaximumAdjacentLineString <em>Maximum Adjacent Line String</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getMaximumAdjacentSurface <em>Maximum Adjacent Surface</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getMeasureLiteral <em>Measure Literal</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getMoveto <em>Moveto</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getNullColor <em>Null Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getNullSymbolizer <em>Null Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPerpendicularOffset <em>Perpendicular Offset</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPointLabel <em>Point Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPointsInArea <em>Points In Area</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPointsOnLine <em>Points On Line</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getPointSymbolizer <em>Point Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getRelateGeometry <em>Relate Geometry</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getRelateTopology <em>Relate Topology</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSelfStep <em>Self Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getShieldedPointLabel <em>Shielded Point Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSkeletonLine <em>Skeleton Line</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSlopeHatchLines <em>Slope Hatch Lines</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSolidFill <em>Solid Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSolidSection <em>Solid Section</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSolidStroke <em>Solid Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSome <em>Some</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getStep <em>Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getSymbologyCatalog <em>Symbology Catalog</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getTagSet <em>Tag Set</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getTextGraphic <em>Text Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getTextSection <em>Text Section</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getTextSymbolizer <em>Text Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getVariableStep <em>Variable Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DocumentRootImpl#getVariantGeometry <em>Variant Geometry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AAAPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AAAPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AAAPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalSymbolizersType1 getAdditionalSymbolizers() {
		return (AdditionalSymbolizersType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_AdditionalSymbolizers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalSymbolizers(AdditionalSymbolizersType1 newAdditionalSymbolizers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_AdditionalSymbolizers(), newAdditionalSymbolizers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalSymbolizers(AdditionalSymbolizersType1 newAdditionalSymbolizers) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_AdditionalSymbolizers(), newAdditionalSymbolizers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaGraphicType getAreaGraphic() {
		return (AreaGraphicType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_AreaGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaGraphic(AreaGraphicType newAreaGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_AreaGraphic(), newAreaGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaGraphic(AreaGraphicType newAreaGraphic) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_AreaGraphic(), newAreaGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleGraphicType getSimpleGraphic() {
		return (SimpleGraphicType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SimpleGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleGraphic(SimpleGraphicType newSimpleGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SimpleGraphic(), newSimpleGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType3 getGraphic() {
		return (GraphicType3)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Graphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphic(GraphicType3 newGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Graphic(), newGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementType1 getElement() {
		return (ElementType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Element(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(ElementType1 newElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Element(), newElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaSymbolizerType getAreaSymbolizer() {
		return (AreaSymbolizerType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_AreaSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaSymbolizer(AreaSymbolizerType newAreaSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_AreaSymbolizer(), newAreaSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaSymbolizer(AreaSymbolizerType newAreaSymbolizer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_AreaSymbolizer(), newAreaSymbolizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PureSymbolizerType1 getPureSymbolizer() {
		return (PureSymbolizerType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PureSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPureSymbolizer(PureSymbolizerType1 newPureSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PureSymbolizer(), newPureSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolizerType1 getSymbolizer() {
		return (SymbolizerType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Symbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbolizer(SymbolizerType1 newSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Symbolizer(), newSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxPointType getBoundingBoxPoint() {
		return (BoundingBoxPointType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_BoundingBoxPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingBoxPoint(BoundingBoxPointType newBoundingBoxPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_BoundingBoxPoint(), newBoundingBoxPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundingBoxPoint(BoundingBoxPointType newBoundingBoxPoint) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_BoundingBoxPoint(), newBoundingBoxPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacementRuleType getPlacementRule() {
		return (PlacementRuleType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PlacementRule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementRule(PlacementRuleType newPlacementRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PlacementRule(), newPlacementRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterPointType getCenterPoint() {
		return (CenterPointType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_CenterPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterPoint(CenterPointType newCenterPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_CenterPoint(), newCenterPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenterPoint(CenterPointType newCenterPoint) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_CenterPoint(), newCenterPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircularArcType getCircularArc() {
		return (CircularArcType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_CircularArc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircularArc(CircularArcType newCircularArc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_CircularArc(), newCircularArc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCircularArc(CircularArcType newCircularArc) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_CircularArc(), newCircularArc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathElementType getPathElement() {
		return (PathElementType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PathElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathElement(PathElementType newPathElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PathElement(), newPathElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloseType getClose() {
		return (CloseType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Close(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClose(CloseType newClose, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Close(), newClose, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClose(CloseType newClose) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Close(), newClose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorType2 getColor() {
		return (ColorType2)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Color(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(ColorType2 newColor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Color(), newColor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorCMYKType getColorCMYK() {
		return (ColorCMYKType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_ColorCMYK(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColorCMYK(ColorCMYKType newColorCMYK, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_ColorCMYK(), newColorCMYK, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorCMYK(ColorCMYKType newColorCMYK) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_ColorCMYK(), newColorCMYK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorRGBType getColorRGB() {
		return (ColorRGBType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_ColorRGB(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColorRGB(ColorRGBType newColorRGB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_ColorRGB(), newColorRGB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorRGB(ColorRGBType newColorRGB) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_ColorRGB(), newColorRGB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeGraphicType getCompositeGraphic() {
		return (CompositeGraphicType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_CompositeGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeGraphic(CompositeGraphicType newCompositeGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_CompositeGraphic(), newCompositeGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeGraphic(CompositeGraphicType newCompositeGraphic) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_CompositeGraphic(), newCompositeGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundStrokeType getCompoundStroke() {
		return (CompoundStrokeType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_CompoundStroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundStroke(CompoundStrokeType newCompoundStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_CompoundStroke(), newCompoundStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundStroke(CompoundStrokeType newCompoundStroke) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_CompoundStroke(), newCompoundStroke);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType5 getStroke() {
		return (StrokeType5)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Stroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStroke(StrokeType5 newStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Stroke(), newStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundStrokeSectionType getCompoundStrokeSection() {
		return (CompoundStrokeSectionType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_CompoundStrokeSection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundStrokeSection(CompoundStrokeSectionType newCompoundStrokeSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_CompoundStrokeSection(), newCompoundStrokeSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStepType getCurrentStep() {
		return (CurrentStepType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_CurrentStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStep(CurrentStepType newCurrentStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_CurrentStep(), newCurrentStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStep(CurrentStepType newCurrentStep) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_CurrentStep(), newCurrentStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstStepType1 getFirstStep() {
		return (FirstStepType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_FirstStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstStep(FirstStepType1 newFirstStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_FirstStep(), newFirstStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvetoType getCurveto() {
		return (CurvetoType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Curveto(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveto(CurvetoType newCurveto, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Curveto(), newCurveto, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveto(CurvetoType newCurveto) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Curveto(), newCurveto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DashedStrokeType getDashedStroke() {
		return (DashedStrokeType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_DashedStroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDashedStroke(DashedStrokeType newDashedStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_DashedStroke(), newDashedStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDashedStroke(DashedStrokeType newDashedStroke) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_DashedStroke(), newDashedStroke);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidOrDashedStrokeType getSolidOrDashedStroke() {
		return (SolidOrDashedStrokeType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SolidOrDashedStroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidOrDashedStroke(SolidOrDashedStrokeType newSolidOrDashedStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SolidOrDashedStroke(), newSolidOrDashedStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignRuleType1 getDesignRule() {
		return (DesignRuleType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_DesignRule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignRule(DesignRuleType1 newDesignRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_DesignRule(), newDesignRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignRule(DesignRuleType1 newDesignRule) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_DesignRule(), newDesignRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplacementType getDisplacement() {
		return (DisplacementType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Displacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplacement(DisplacementType newDisplacement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Displacement(), newDisplacement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplacement(DisplacementType newDisplacement) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Displacement(), newDisplacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmitType1 getEmit() {
		return (EmitType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Emit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmit(EmitType1 newEmit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Emit(), newEmit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmit(EmitType1 newEmit) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Emit(), newEmit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EveryType getEvery() {
		return (EveryType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Every(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvery(EveryType newEvery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Every(), newEvery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvery(EveryType newEvery) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Every(), newEvery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierType getQuantifier() {
		return (QuantifierType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Quantifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifier(QuantifierType newQuantifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Quantifier(), newQuantifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionType1 getExpression() {
		return (ExpressionType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionType1 newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeStepType getFeatureTypeStep() {
		return (FeatureTypeStepType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_FeatureTypeStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureTypeStep(FeatureTypeStepType newFeatureTypeStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_FeatureTypeStep(), newFeatureTypeStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTypeStep(FeatureTypeStepType newFeatureTypeStep) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_FeatureTypeStep(), newFeatureTypeStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FillType getFill() {
		return (FillType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Fill(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFill(FillType newFill, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Fill(), newFill, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType1 getFilter() {
		return (FilterType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType1 newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(FilterType1 newFilter) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilteredSymbolizerType getFilteredSymbolizer() {
		return (FilteredSymbolizerType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_FilteredSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilteredSymbolizer(FilteredSymbolizerType newFilteredSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_FilteredSymbolizer(), newFilteredSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilteredSymbolizer(FilteredSymbolizerType newFilteredSymbolizer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_FilteredSymbolizer(), newFilteredSymbolizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontType1 getFont() {
		return (FontType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Font(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(FontType1 newFont, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Font(), newFont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont(FontType1 newFont) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Font(), newFont);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForType getFor() {
		return (ForType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_For(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(ForType newFor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_For(), newFor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFor(ForType newFor) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_For(), newFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GapType getGap() {
		return (GapType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Gap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGap(GapType newGap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Gap(), newGap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGap(GapType newGap) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Gap(), newGap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicFillType getGraphicFill() {
		return (GraphicFillType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_GraphicFill(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicFill(GraphicFillType newGraphicFill, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_GraphicFill(), newGraphicFill, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphicFill(GraphicFillType newGraphicFill) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_GraphicFill(), newGraphicFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloType1 getHalo() {
		return (HaloType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Halo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHalo(HaloType1 newHalo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Halo(), newHalo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHalo(HaloType1 newHalo) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Halo(), newHalo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchFillType getHatchFill() {
		return (HatchFillType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_HatchFill(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHatchFill(HatchFillType newHatchFill, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_HatchFill(), newHatchFill, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchFill(HatchFillType newHatchFill) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_HatchFill(), newHatchFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchFillLongestSideType getHatchFillLongestSide() {
		return (HatchFillLongestSideType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_HatchFillLongestSide(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHatchFillLongestSide(HatchFillLongestSideType newHatchFillLongestSide, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_HatchFillLongestSide(), newHatchFillLongestSide, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchFillLongestSide(HatchFillLongestSideType newHatchFillLongestSide) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_HatchFillLongestSide(), newHatchFillLongestSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchLinesType getHatchLines() {
		return (HatchLinesType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_HatchLines(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHatchLines(HatchLinesType newHatchLines, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_HatchLines(), newHatchLines, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchLines(HatchLinesType newHatchLines) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_HatchLines(), newHatchLines);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchLinesLongestSideType getHatchLinesLongestSide() {
		return (HatchLinesLongestSideType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_HatchLinesLongestSide(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHatchLinesLongestSide(HatchLinesLongestSideType newHatchLinesLongestSide, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_HatchLinesLongestSide(), newHatchLinesLongestSide, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchLinesLongestSide(HatchLinesLongestSideType newHatchLinesLongestSide) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_HatchLinesLongestSide(), newHatchLinesLongestSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfType getIf() {
		return (IfType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_If(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(IfType newIf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_If(), newIf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIf(IfType newIf) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_If(), newIf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType3 getLabel() {
		return (LabelType3)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType3 newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Label(), newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType3 newLabel) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerType1 getLayer() {
		return (LayerType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Layer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayer(LayerType1 newLayer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Layer(), newLayer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayer(LayerType1 newLayer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Layer(), newLayer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineGraphicType getLineGraphic() {
		return (LineGraphicType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_LineGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineGraphic(LineGraphicType newLineGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_LineGraphic(), newLineGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineGraphic(LineGraphicType newLineGraphic) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_LineGraphic(), newLineGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineLabelType getLineLabel() {
		return (LineLabelType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_LineLabel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineLabel(LineLabelType newLineLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_LineLabel(), newLineLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineLabel(LineLabelType newLineLabel) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_LineLabel(), newLineLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinePlacedGraphicType getLinePlacedGraphic() {
		return (LinePlacedGraphicType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_LinePlacedGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinePlacedGraphic(LinePlacedGraphicType newLinePlacedGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_LinePlacedGraphic(), newLinePlacedGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinePlacedGraphic(LinePlacedGraphicType newLinePlacedGraphic) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_LinePlacedGraphic(), newLinePlacedGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineSymbolizerType getLineSymbolizer() {
		return (LineSymbolizerType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_LineSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineSymbolizer(LineSymbolizerType newLineSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_LineSymbolizer(), newLineSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSymbolizer(LineSymbolizerType newLineSymbolizer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_LineSymbolizer(), newLineSymbolizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinetoType getLineto() {
		return (LinetoType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Lineto(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineto(LinetoType newLineto, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Lineto(), newLineto, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineto(LinetoType newLineto) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Lineto(), newLineto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralType getLiteral() {
		return (LiteralType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Literal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(LiteralType newLiteral, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Literal(), newLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(LiteralType newLiteral) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Literal(), newLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumAdjacentLineStringType getMaximumAdjacentLineString() {
		return (MaximumAdjacentLineStringType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_MaximumAdjacentLineString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumAdjacentLineString(MaximumAdjacentLineStringType newMaximumAdjacentLineString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_MaximumAdjacentLineString(), newMaximumAdjacentLineString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAdjacentLineString(MaximumAdjacentLineStringType newMaximumAdjacentLineString) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_MaximumAdjacentLineString(), newMaximumAdjacentLineString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumAdjacentSurfaceType getMaximumAdjacentSurface() {
		return (MaximumAdjacentSurfaceType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_MaximumAdjacentSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumAdjacentSurface(MaximumAdjacentSurfaceType newMaximumAdjacentSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_MaximumAdjacentSurface(), newMaximumAdjacentSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAdjacentSurface(MaximumAdjacentSurfaceType newMaximumAdjacentSurface) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_MaximumAdjacentSurface(), newMaximumAdjacentSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureLiteralType getMeasureLiteral() {
		return (MeasureLiteralType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_MeasureLiteral(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureLiteral(MeasureLiteralType newMeasureLiteral, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_MeasureLiteral(), newMeasureLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasureLiteral(MeasureLiteralType newMeasureLiteral) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_MeasureLiteral(), newMeasureLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovetoType getMoveto() {
		return (MovetoType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Moveto(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoveto(MovetoType newMoveto, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Moveto(), newMoveto, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoveto(MovetoType newMoveto) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Moveto(), newMoveto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullColorType getNullColor() {
		return (NullColorType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_NullColor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullColor(NullColorType newNullColor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_NullColor(), newNullColor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullColor(NullColorType newNullColor) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_NullColor(), newNullColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullSymbolizerType getNullSymbolizer() {
		return (NullSymbolizerType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_NullSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullSymbolizer(NullSymbolizerType newNullSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_NullSymbolizer(), newNullSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullSymbolizer(NullSymbolizerType newNullSymbolizer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_NullSymbolizer(), newNullSymbolizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getOperation() {
		return (OperationType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Operation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(OperationType newOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(OperationType newOperation) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathType getPath() {
		return (PathType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Path(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(PathType newPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Path(), newPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(PathType newPath) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Path(), newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerpendicularOffsetType getPerpendicularOffset() {
		return (PerpendicularOffsetType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PerpendicularOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerpendicularOffset(PerpendicularOffsetType newPerpendicularOffset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PerpendicularOffset(), newPerpendicularOffset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerpendicularOffset(PerpendicularOffsetType newPerpendicularOffset) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_PerpendicularOffset(), newPerpendicularOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointLabelType getPointLabel() {
		return (PointLabelType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PointLabel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointLabel(PointLabelType newPointLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PointLabel(), newPointLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointLabel(PointLabelType newPointLabel) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_PointLabel(), newPointLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsInAreaType getPointsInArea() {
		return (PointsInAreaType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PointsInArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointsInArea(PointsInAreaType newPointsInArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PointsInArea(), newPointsInArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointsInArea(PointsInAreaType newPointsInArea) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_PointsInArea(), newPointsInArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsOnLineType getPointsOnLine() {
		return (PointsOnLineType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PointsOnLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointsOnLine(PointsOnLineType newPointsOnLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PointsOnLine(), newPointsOnLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointsOnLine(PointsOnLineType newPointsOnLine) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_PointsOnLine(), newPointsOnLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointSymbolizerType getPointSymbolizer() {
		return (PointSymbolizerType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_PointSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointSymbolizer(PointSymbolizerType newPointSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_PointSymbolizer(), newPointSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointSymbolizer(PointSymbolizerType newPointSymbolizer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_PointSymbolizer(), newPointSymbolizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateGeometryType getRelateGeometry() {
		return (RelateGeometryType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_RelateGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelateGeometry(RelateGeometryType newRelateGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_RelateGeometry(), newRelateGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelateGeometry(RelateGeometryType newRelateGeometry) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_RelateGeometry(), newRelateGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateTopologyType getRelateTopology() {
		return (RelateTopologyType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_RelateTopology(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelateTopology(RelateTopologyType newRelateTopology, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_RelateTopology(), newRelateTopology, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelateTopology(RelateTopologyType newRelateTopology) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_RelateTopology(), newRelateTopology);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleType getRule() {
		return (RuleType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Rule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(RuleType newRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Rule(), newRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRule(RuleType newRule) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Rule(), newRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleSetType getRuleSet() {
		return (RuleSetType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_RuleSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleSet(RuleSetType newRuleSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_RuleSet(), newRuleSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleSet(RuleSetType newRuleSet) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_RuleSet(), newRuleSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfStepType getSelfStep() {
		return (SelfStepType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SelfStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfStep(SelfStepType newSelfStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SelfStep(), newSelfStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfStep(SelfStepType newSelfStep) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SelfStep(), newSelfStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShieldedPointLabelType getShieldedPointLabel() {
		return (ShieldedPointLabelType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_ShieldedPointLabel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShieldedPointLabel(ShieldedPointLabelType newShieldedPointLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_ShieldedPointLabel(), newShieldedPointLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShieldedPointLabel(ShieldedPointLabelType newShieldedPointLabel) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_ShieldedPointLabel(), newShieldedPointLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkeletonLineType getSkeletonLine() {
		return (SkeletonLineType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SkeletonLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkeletonLine(SkeletonLineType newSkeletonLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SkeletonLine(), newSkeletonLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkeletonLine(SkeletonLineType newSkeletonLine) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SkeletonLine(), newSkeletonLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlopeHatchLinesType getSlopeHatchLines() {
		return (SlopeHatchLinesType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SlopeHatchLines(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlopeHatchLines(SlopeHatchLinesType newSlopeHatchLines, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SlopeHatchLines(), newSlopeHatchLines, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlopeHatchLines(SlopeHatchLinesType newSlopeHatchLines) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SlopeHatchLines(), newSlopeHatchLines);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidFillType getSolidFill() {
		return (SolidFillType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SolidFill(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidFill(SolidFillType newSolidFill, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SolidFill(), newSolidFill, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidFill(SolidFillType newSolidFill) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SolidFill(), newSolidFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidSectionType getSolidSection() {
		return (SolidSectionType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SolidSection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidSection(SolidSectionType newSolidSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SolidSection(), newSolidSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidSection(SolidSectionType newSolidSection) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SolidSection(), newSolidSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidStrokeType getSolidStroke() {
		return (SolidStrokeType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SolidStroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidStroke(SolidStrokeType newSolidStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SolidStroke(), newSolidStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidStroke(SolidStrokeType newSolidStroke) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SolidStroke(), newSolidStroke);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SomeType getSome() {
		return (SomeType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Some(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSome(SomeType newSome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Some(), newSome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSome(SomeType newSome) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Some(), newSome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepType getStep() {
		return (StepType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Step(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(StepType newStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Step(), newStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(StepType newStep) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Step(), newStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType getStyle() {
		return (StyleType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Style(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(StyleType newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Style(), newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(StyleType newStyle) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Style(), newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbologyCatalogType getSymbologyCatalog() {
		return (SymbologyCatalogType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_SymbologyCatalog(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbologyCatalog(SymbologyCatalogType newSymbologyCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_SymbologyCatalog(), newSymbologyCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbologyCatalog(SymbologyCatalogType newSymbologyCatalog) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_SymbologyCatalog(), newSymbologyCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagType getTag() {
		return (TagType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Tag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTag(TagType newTag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Tag(), newTag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(TagType newTag) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Tag(), newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagSetType getTagSet() {
		return (TagSetType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_TagSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTagSet(TagSetType newTagSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_TagSet(), newTagSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagSet(TagSetType newTagSet) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_TagSet(), newTagSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextGraphicType getTextGraphic() {
		return (TextGraphicType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_TextGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextGraphic(TextGraphicType newTextGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_TextGraphic(), newTextGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextGraphic(TextGraphicType newTextGraphic) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_TextGraphic(), newTextGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextSectionType getTextSection() {
		return (TextSectionType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_TextSection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextSection(TextSectionType newTextSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_TextSection(), newTextSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextSection(TextSectionType newTextSection) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_TextSection(), newTextSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextSymbolizerType getTextSymbolizer() {
		return (TextSymbolizerType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_TextSymbolizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextSymbolizer(TextSymbolizerType newTextSymbolizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_TextSymbolizer(), newTextSymbolizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextSymbolizer(TextSymbolizerType newTextSymbolizer) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_TextSymbolizer(), newTextSymbolizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TubeType getTube() {
		return (TubeType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Tube(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTube(TubeType newTube, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Tube(), newTube, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTube(TubeType newTube) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Tube(), newTube);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType1 getVariable() {
		return (VariableType1)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_Variable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(VariableType1 newVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_Variable(), newVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(VariableType1 newVariable) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_Variable(), newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableStepType getVariableStep() {
		return (VariableStepType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_VariableStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableStep(VariableStepType newVariableStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_VariableStep(), newVariableStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableStep(VariableStepType newVariableStep) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_VariableStep(), newVariableStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantGeometryType getVariantGeometry() {
		return (VariantGeometryType)getMixed().get(AAAPackage.eINSTANCE.getDocumentRoot_VariantGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantGeometry(VariantGeometryType newVariantGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AAAPackage.eINSTANCE.getDocumentRoot_VariantGeometry(), newVariantGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariantGeometry(VariantGeometryType newVariantGeometry) {
		((FeatureMap.Internal)getMixed()).set(AAAPackage.eINSTANCE.getDocumentRoot_VariantGeometry(), newVariantGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AAAPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AAAPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AAAPackage.DOCUMENT_ROOT__ADDITIONAL_SYMBOLIZERS:
				return basicSetAdditionalSymbolizers(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__AREA_GRAPHIC:
				return basicSetAreaGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SIMPLE_GRAPHIC:
				return basicSetSimpleGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC:
				return basicSetGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__ELEMENT:
				return basicSetElement(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__AREA_SYMBOLIZER:
				return basicSetAreaSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__PURE_SYMBOLIZER:
				return basicSetPureSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SYMBOLIZER:
				return basicSetSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__BOUNDING_BOX_POINT:
				return basicSetBoundingBoxPoint(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__PLACEMENT_RULE:
				return basicSetPlacementRule(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__CENTER_POINT:
				return basicSetCenterPoint(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__CIRCULAR_ARC:
				return basicSetCircularArc(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__PATH_ELEMENT:
				return basicSetPathElement(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__CLOSE:
				return basicSetClose(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__COLOR:
				return basicSetColor(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__COLOR_CMYK:
				return basicSetColorCMYK(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__COLOR_RGB:
				return basicSetColorRGB(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__COMPOSITE_GRAPHIC:
				return basicSetCompositeGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE:
				return basicSetCompoundStroke(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__STROKE:
				return basicSetStroke(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE_SECTION:
				return basicSetCompoundStrokeSection(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__CURRENT_STEP:
				return basicSetCurrentStep(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FIRST_STEP:
				return basicSetFirstStep(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__CURVETO:
				return basicSetCurveto(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__DASHED_STROKE:
				return basicSetDashedStroke(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SOLID_OR_DASHED_STROKE:
				return basicSetSolidOrDashedStroke(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__DESIGN_RULE:
				return basicSetDesignRule(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__DISPLACEMENT:
				return basicSetDisplacement(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__EMIT:
				return basicSetEmit(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__EVERY:
				return basicSetEvery(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__QUANTIFIER:
				return basicSetQuantifier(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FEATURE_TYPE_STEP:
				return basicSetFeatureTypeStep(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FILL:
				return basicSetFill(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FILTERED_SYMBOLIZER:
				return basicSetFilteredSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FONT:
				return basicSetFont(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__FOR:
				return basicSetFor(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__GAP:
				return basicSetGap(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC_FILL:
				return basicSetGraphicFill(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__HALO:
				return basicSetHalo(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL:
				return basicSetHatchFill(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL_LONGEST_SIDE:
				return basicSetHatchFillLongestSide(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES:
				return basicSetHatchLines(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES_LONGEST_SIDE:
				return basicSetHatchLinesLongestSide(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__IF:
				return basicSetIf(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LABEL:
				return basicSetLabel(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LAYER:
				return basicSetLayer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LINE_GRAPHIC:
				return basicSetLineGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LINE_LABEL:
				return basicSetLineLabel(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LINE_PLACED_GRAPHIC:
				return basicSetLinePlacedGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LINE_SYMBOLIZER:
				return basicSetLineSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LINETO:
				return basicSetLineto(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__LITERAL:
				return basicSetLiteral(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_LINE_STRING:
				return basicSetMaximumAdjacentLineString(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_SURFACE:
				return basicSetMaximumAdjacentSurface(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__MEASURE_LITERAL:
				return basicSetMeasureLiteral(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__MOVETO:
				return basicSetMoveto(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__NULL_COLOR:
				return basicSetNullColor(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__NULL_SYMBOLIZER:
				return basicSetNullSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__PATH:
				return basicSetPath(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__PERPENDICULAR_OFFSET:
				return basicSetPerpendicularOffset(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__POINT_LABEL:
				return basicSetPointLabel(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__POINTS_IN_AREA:
				return basicSetPointsInArea(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__POINTS_ON_LINE:
				return basicSetPointsOnLine(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__POINT_SYMBOLIZER:
				return basicSetPointSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__RELATE_GEOMETRY:
				return basicSetRelateGeometry(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__RELATE_TOPOLOGY:
				return basicSetRelateTopology(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__RULE:
				return basicSetRule(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__RULE_SET:
				return basicSetRuleSet(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SELF_STEP:
				return basicSetSelfStep(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SHIELDED_POINT_LABEL:
				return basicSetShieldedPointLabel(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SKELETON_LINE:
				return basicSetSkeletonLine(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SLOPE_HATCH_LINES:
				return basicSetSlopeHatchLines(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SOLID_FILL:
				return basicSetSolidFill(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SOLID_SECTION:
				return basicSetSolidSection(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SOLID_STROKE:
				return basicSetSolidStroke(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SOME:
				return basicSetSome(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__STEP:
				return basicSetStep(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__SYMBOLOGY_CATALOG:
				return basicSetSymbologyCatalog(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__TAG:
				return basicSetTag(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__TAG_SET:
				return basicSetTagSet(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__TEXT_GRAPHIC:
				return basicSetTextGraphic(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__TEXT_SECTION:
				return basicSetTextSection(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__TEXT_SYMBOLIZER:
				return basicSetTextSymbolizer(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__TUBE:
				return basicSetTube(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__VARIABLE:
				return basicSetVariable(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__VARIABLE_STEP:
				return basicSetVariableStep(null, msgs);
			case AAAPackage.DOCUMENT_ROOT__VARIANT_GEOMETRY:
				return basicSetVariantGeometry(null, msgs);
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
			case AAAPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AAAPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AAAPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AAAPackage.DOCUMENT_ROOT__ADDITIONAL_SYMBOLIZERS:
				return getAdditionalSymbolizers();
			case AAAPackage.DOCUMENT_ROOT__AREA_GRAPHIC:
				return getAreaGraphic();
			case AAAPackage.DOCUMENT_ROOT__SIMPLE_GRAPHIC:
				return getSimpleGraphic();
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC:
				return getGraphic();
			case AAAPackage.DOCUMENT_ROOT__ELEMENT:
				return getElement();
			case AAAPackage.DOCUMENT_ROOT__AREA_SYMBOLIZER:
				return getAreaSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__PURE_SYMBOLIZER:
				return getPureSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__SYMBOLIZER:
				return getSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__BOUNDING_BOX_POINT:
				return getBoundingBoxPoint();
			case AAAPackage.DOCUMENT_ROOT__PLACEMENT_RULE:
				return getPlacementRule();
			case AAAPackage.DOCUMENT_ROOT__CENTER_POINT:
				return getCenterPoint();
			case AAAPackage.DOCUMENT_ROOT__CIRCULAR_ARC:
				return getCircularArc();
			case AAAPackage.DOCUMENT_ROOT__PATH_ELEMENT:
				return getPathElement();
			case AAAPackage.DOCUMENT_ROOT__CLOSE:
				return getClose();
			case AAAPackage.DOCUMENT_ROOT__COLOR:
				return getColor();
			case AAAPackage.DOCUMENT_ROOT__COLOR_CMYK:
				return getColorCMYK();
			case AAAPackage.DOCUMENT_ROOT__COLOR_RGB:
				return getColorRGB();
			case AAAPackage.DOCUMENT_ROOT__COMPOSITE_GRAPHIC:
				return getCompositeGraphic();
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE:
				return getCompoundStroke();
			case AAAPackage.DOCUMENT_ROOT__STROKE:
				return getStroke();
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE_SECTION:
				return getCompoundStrokeSection();
			case AAAPackage.DOCUMENT_ROOT__CURRENT_STEP:
				return getCurrentStep();
			case AAAPackage.DOCUMENT_ROOT__FIRST_STEP:
				return getFirstStep();
			case AAAPackage.DOCUMENT_ROOT__CURVETO:
				return getCurveto();
			case AAAPackage.DOCUMENT_ROOT__DASHED_STROKE:
				return getDashedStroke();
			case AAAPackage.DOCUMENT_ROOT__SOLID_OR_DASHED_STROKE:
				return getSolidOrDashedStroke();
			case AAAPackage.DOCUMENT_ROOT__DESIGN_RULE:
				return getDesignRule();
			case AAAPackage.DOCUMENT_ROOT__DISPLACEMENT:
				return getDisplacement();
			case AAAPackage.DOCUMENT_ROOT__EMIT:
				return getEmit();
			case AAAPackage.DOCUMENT_ROOT__EVERY:
				return getEvery();
			case AAAPackage.DOCUMENT_ROOT__QUANTIFIER:
				return getQuantifier();
			case AAAPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case AAAPackage.DOCUMENT_ROOT__FEATURE_TYPE_STEP:
				return getFeatureTypeStep();
			case AAAPackage.DOCUMENT_ROOT__FILL:
				return getFill();
			case AAAPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case AAAPackage.DOCUMENT_ROOT__FILTERED_SYMBOLIZER:
				return getFilteredSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__FONT:
				return getFont();
			case AAAPackage.DOCUMENT_ROOT__FOR:
				return getFor();
			case AAAPackage.DOCUMENT_ROOT__GAP:
				return getGap();
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC_FILL:
				return getGraphicFill();
			case AAAPackage.DOCUMENT_ROOT__HALO:
				return getHalo();
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL:
				return getHatchFill();
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL_LONGEST_SIDE:
				return getHatchFillLongestSide();
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES:
				return getHatchLines();
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES_LONGEST_SIDE:
				return getHatchLinesLongestSide();
			case AAAPackage.DOCUMENT_ROOT__IF:
				return getIf();
			case AAAPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case AAAPackage.DOCUMENT_ROOT__LAYER:
				return getLayer();
			case AAAPackage.DOCUMENT_ROOT__LINE_GRAPHIC:
				return getLineGraphic();
			case AAAPackage.DOCUMENT_ROOT__LINE_LABEL:
				return getLineLabel();
			case AAAPackage.DOCUMENT_ROOT__LINE_PLACED_GRAPHIC:
				return getLinePlacedGraphic();
			case AAAPackage.DOCUMENT_ROOT__LINE_SYMBOLIZER:
				return getLineSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__LINETO:
				return getLineto();
			case AAAPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral();
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_LINE_STRING:
				return getMaximumAdjacentLineString();
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_SURFACE:
				return getMaximumAdjacentSurface();
			case AAAPackage.DOCUMENT_ROOT__MEASURE_LITERAL:
				return getMeasureLiteral();
			case AAAPackage.DOCUMENT_ROOT__MOVETO:
				return getMoveto();
			case AAAPackage.DOCUMENT_ROOT__NULL_COLOR:
				return getNullColor();
			case AAAPackage.DOCUMENT_ROOT__NULL_SYMBOLIZER:
				return getNullSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation();
			case AAAPackage.DOCUMENT_ROOT__PATH:
				return getPath();
			case AAAPackage.DOCUMENT_ROOT__PERPENDICULAR_OFFSET:
				return getPerpendicularOffset();
			case AAAPackage.DOCUMENT_ROOT__POINT_LABEL:
				return getPointLabel();
			case AAAPackage.DOCUMENT_ROOT__POINTS_IN_AREA:
				return getPointsInArea();
			case AAAPackage.DOCUMENT_ROOT__POINTS_ON_LINE:
				return getPointsOnLine();
			case AAAPackage.DOCUMENT_ROOT__POINT_SYMBOLIZER:
				return getPointSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case AAAPackage.DOCUMENT_ROOT__RELATE_GEOMETRY:
				return getRelateGeometry();
			case AAAPackage.DOCUMENT_ROOT__RELATE_TOPOLOGY:
				return getRelateTopology();
			case AAAPackage.DOCUMENT_ROOT__RULE:
				return getRule();
			case AAAPackage.DOCUMENT_ROOT__RULE_SET:
				return getRuleSet();
			case AAAPackage.DOCUMENT_ROOT__SELF_STEP:
				return getSelfStep();
			case AAAPackage.DOCUMENT_ROOT__SHIELDED_POINT_LABEL:
				return getShieldedPointLabel();
			case AAAPackage.DOCUMENT_ROOT__SKELETON_LINE:
				return getSkeletonLine();
			case AAAPackage.DOCUMENT_ROOT__SLOPE_HATCH_LINES:
				return getSlopeHatchLines();
			case AAAPackage.DOCUMENT_ROOT__SOLID_FILL:
				return getSolidFill();
			case AAAPackage.DOCUMENT_ROOT__SOLID_SECTION:
				return getSolidSection();
			case AAAPackage.DOCUMENT_ROOT__SOLID_STROKE:
				return getSolidStroke();
			case AAAPackage.DOCUMENT_ROOT__SOME:
				return getSome();
			case AAAPackage.DOCUMENT_ROOT__STEP:
				return getStep();
			case AAAPackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case AAAPackage.DOCUMENT_ROOT__SYMBOLOGY_CATALOG:
				return getSymbologyCatalog();
			case AAAPackage.DOCUMENT_ROOT__TAG:
				return getTag();
			case AAAPackage.DOCUMENT_ROOT__TAG_SET:
				return getTagSet();
			case AAAPackage.DOCUMENT_ROOT__TEXT_GRAPHIC:
				return getTextGraphic();
			case AAAPackage.DOCUMENT_ROOT__TEXT_SECTION:
				return getTextSection();
			case AAAPackage.DOCUMENT_ROOT__TEXT_SYMBOLIZER:
				return getTextSymbolizer();
			case AAAPackage.DOCUMENT_ROOT__TUBE:
				return getTube();
			case AAAPackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable();
			case AAAPackage.DOCUMENT_ROOT__VARIABLE_STEP:
				return getVariableStep();
			case AAAPackage.DOCUMENT_ROOT__VARIANT_GEOMETRY:
				return getVariantGeometry();
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
			case AAAPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__ADDITIONAL_SYMBOLIZERS:
				setAdditionalSymbolizers((AdditionalSymbolizersType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__AREA_GRAPHIC:
				setAreaGraphic((AreaGraphicType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__AREA_SYMBOLIZER:
				setAreaSymbolizer((AreaSymbolizerType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__BOUNDING_BOX_POINT:
				setBoundingBoxPoint((BoundingBoxPointType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__CENTER_POINT:
				setCenterPoint((CenterPointType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__CIRCULAR_ARC:
				setCircularArc((CircularArcType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__CLOSE:
				setClose((CloseType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__COLOR_CMYK:
				setColorCMYK((ColorCMYKType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__COLOR_RGB:
				setColorRGB((ColorRGBType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__COMPOSITE_GRAPHIC:
				setCompositeGraphic((CompositeGraphicType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE:
				setCompoundStroke((CompoundStrokeType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__CURRENT_STEP:
				setCurrentStep((CurrentStepType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__CURVETO:
				setCurveto((CurvetoType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__DASHED_STROKE:
				setDashedStroke((DashedStrokeType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__DESIGN_RULE:
				setDesignRule((DesignRuleType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__DISPLACEMENT:
				setDisplacement((DisplacementType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__EMIT:
				setEmit((EmitType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__EVERY:
				setEvery((EveryType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__FEATURE_TYPE_STEP:
				setFeatureTypeStep((FeatureTypeStepType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__FILTERED_SYMBOLIZER:
				setFilteredSymbolizer((FilteredSymbolizerType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__FONT:
				setFont((FontType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__FOR:
				setFor((ForType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__GAP:
				setGap((GapType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC_FILL:
				setGraphicFill((GraphicFillType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__HALO:
				setHalo((HaloType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL:
				setHatchFill((HatchFillType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL_LONGEST_SIDE:
				setHatchFillLongestSide((HatchFillLongestSideType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES:
				setHatchLines((HatchLinesType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES_LONGEST_SIDE:
				setHatchLinesLongestSide((HatchLinesLongestSideType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__IF:
				setIf((IfType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType3)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LAYER:
				setLayer((LayerType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_GRAPHIC:
				setLineGraphic((LineGraphicType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_LABEL:
				setLineLabel((LineLabelType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_PLACED_GRAPHIC:
				setLinePlacedGraphic((LinePlacedGraphicType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_SYMBOLIZER:
				setLineSymbolizer((LineSymbolizerType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINETO:
				setLineto((LinetoType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_LINE_STRING:
				setMaximumAdjacentLineString((MaximumAdjacentLineStringType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_SURFACE:
				setMaximumAdjacentSurface((MaximumAdjacentSurfaceType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__MEASURE_LITERAL:
				setMeasureLiteral((MeasureLiteralType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__MOVETO:
				setMoveto((MovetoType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__NULL_COLOR:
				setNullColor((NullColorType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__NULL_SYMBOLIZER:
				setNullSymbolizer((NullSymbolizerType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((OperationType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__PATH:
				setPath((PathType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__PERPENDICULAR_OFFSET:
				setPerpendicularOffset((PerpendicularOffsetType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINT_LABEL:
				setPointLabel((PointLabelType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINTS_IN_AREA:
				setPointsInArea((PointsInAreaType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINTS_ON_LINE:
				setPointsOnLine((PointsOnLineType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINT_SYMBOLIZER:
				setPointSymbolizer((PointSymbolizerType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__RELATE_GEOMETRY:
				setRelateGeometry((RelateGeometryType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__RELATE_TOPOLOGY:
				setRelateTopology((RelateTopologyType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__RULE:
				setRule((RuleType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__RULE_SET:
				setRuleSet((RuleSetType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SELF_STEP:
				setSelfStep((SelfStepType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SHIELDED_POINT_LABEL:
				setShieldedPointLabel((ShieldedPointLabelType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SKELETON_LINE:
				setSkeletonLine((SkeletonLineType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SLOPE_HATCH_LINES:
				setSlopeHatchLines((SlopeHatchLinesType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOLID_FILL:
				setSolidFill((SolidFillType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOLID_SECTION:
				setSolidSection((SolidSectionType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOLID_STROKE:
				setSolidStroke((SolidStrokeType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOME:
				setSome((SomeType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__STEP:
				setStep((StepType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__SYMBOLOGY_CATALOG:
				setSymbologyCatalog((SymbologyCatalogType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__TAG:
				setTag((TagType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__TAG_SET:
				setTagSet((TagSetType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__TEXT_GRAPHIC:
				setTextGraphic((TextGraphicType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__TEXT_SECTION:
				setTextSection((TextSectionType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__TEXT_SYMBOLIZER:
				setTextSymbolizer((TextSymbolizerType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__TUBE:
				setTube((TubeType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((VariableType1)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__VARIABLE_STEP:
				setVariableStep((VariableStepType)newValue);
				return;
			case AAAPackage.DOCUMENT_ROOT__VARIANT_GEOMETRY:
				setVariantGeometry((VariantGeometryType)newValue);
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
			case AAAPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AAAPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AAAPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AAAPackage.DOCUMENT_ROOT__ADDITIONAL_SYMBOLIZERS:
				setAdditionalSymbolizers((AdditionalSymbolizersType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__AREA_GRAPHIC:
				setAreaGraphic((AreaGraphicType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__AREA_SYMBOLIZER:
				setAreaSymbolizer((AreaSymbolizerType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__BOUNDING_BOX_POINT:
				setBoundingBoxPoint((BoundingBoxPointType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__CENTER_POINT:
				setCenterPoint((CenterPointType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__CIRCULAR_ARC:
				setCircularArc((CircularArcType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__CLOSE:
				setClose((CloseType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__COLOR_CMYK:
				setColorCMYK((ColorCMYKType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__COLOR_RGB:
				setColorRGB((ColorRGBType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__COMPOSITE_GRAPHIC:
				setCompositeGraphic((CompositeGraphicType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE:
				setCompoundStroke((CompoundStrokeType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__CURRENT_STEP:
				setCurrentStep((CurrentStepType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__CURVETO:
				setCurveto((CurvetoType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__DASHED_STROKE:
				setDashedStroke((DashedStrokeType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__DESIGN_RULE:
				setDesignRule((DesignRuleType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__DISPLACEMENT:
				setDisplacement((DisplacementType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__EMIT:
				setEmit((EmitType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__EVERY:
				setEvery((EveryType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__FEATURE_TYPE_STEP:
				setFeatureTypeStep((FeatureTypeStepType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__FILTERED_SYMBOLIZER:
				setFilteredSymbolizer((FilteredSymbolizerType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__FONT:
				setFont((FontType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__FOR:
				setFor((ForType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__GAP:
				setGap((GapType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC_FILL:
				setGraphicFill((GraphicFillType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__HALO:
				setHalo((HaloType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL:
				setHatchFill((HatchFillType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL_LONGEST_SIDE:
				setHatchFillLongestSide((HatchFillLongestSideType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES:
				setHatchLines((HatchLinesType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES_LONGEST_SIDE:
				setHatchLinesLongestSide((HatchLinesLongestSideType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__IF:
				setIf((IfType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType3)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LAYER:
				setLayer((LayerType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_GRAPHIC:
				setLineGraphic((LineGraphicType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_LABEL:
				setLineLabel((LineLabelType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_PLACED_GRAPHIC:
				setLinePlacedGraphic((LinePlacedGraphicType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINE_SYMBOLIZER:
				setLineSymbolizer((LineSymbolizerType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LINETO:
				setLineto((LinetoType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_LINE_STRING:
				setMaximumAdjacentLineString((MaximumAdjacentLineStringType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_SURFACE:
				setMaximumAdjacentSurface((MaximumAdjacentSurfaceType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__MEASURE_LITERAL:
				setMeasureLiteral((MeasureLiteralType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__MOVETO:
				setMoveto((MovetoType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__NULL_COLOR:
				setNullColor((NullColorType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__NULL_SYMBOLIZER:
				setNullSymbolizer((NullSymbolizerType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((OperationType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__PATH:
				setPath((PathType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__PERPENDICULAR_OFFSET:
				setPerpendicularOffset((PerpendicularOffsetType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINT_LABEL:
				setPointLabel((PointLabelType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINTS_IN_AREA:
				setPointsInArea((PointsInAreaType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINTS_ON_LINE:
				setPointsOnLine((PointsOnLineType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__POINT_SYMBOLIZER:
				setPointSymbolizer((PointSymbolizerType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__RELATE_GEOMETRY:
				setRelateGeometry((RelateGeometryType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__RELATE_TOPOLOGY:
				setRelateTopology((RelateTopologyType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__RULE:
				setRule((RuleType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__RULE_SET:
				setRuleSet((RuleSetType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SELF_STEP:
				setSelfStep((SelfStepType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SHIELDED_POINT_LABEL:
				setShieldedPointLabel((ShieldedPointLabelType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SKELETON_LINE:
				setSkeletonLine((SkeletonLineType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SLOPE_HATCH_LINES:
				setSlopeHatchLines((SlopeHatchLinesType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOLID_FILL:
				setSolidFill((SolidFillType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOLID_SECTION:
				setSolidSection((SolidSectionType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOLID_STROKE:
				setSolidStroke((SolidStrokeType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SOME:
				setSome((SomeType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__STEP:
				setStep((StepType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__SYMBOLOGY_CATALOG:
				setSymbologyCatalog((SymbologyCatalogType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__TAG:
				setTag((TagType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__TAG_SET:
				setTagSet((TagSetType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__TEXT_GRAPHIC:
				setTextGraphic((TextGraphicType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__TEXT_SECTION:
				setTextSection((TextSectionType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__TEXT_SYMBOLIZER:
				setTextSymbolizer((TextSymbolizerType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__TUBE:
				setTube((TubeType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((VariableType1)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__VARIABLE_STEP:
				setVariableStep((VariableStepType)null);
				return;
			case AAAPackage.DOCUMENT_ROOT__VARIANT_GEOMETRY:
				setVariantGeometry((VariantGeometryType)null);
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
			case AAAPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AAAPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AAAPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AAAPackage.DOCUMENT_ROOT__ADDITIONAL_SYMBOLIZERS:
				return getAdditionalSymbolizers() != null;
			case AAAPackage.DOCUMENT_ROOT__AREA_GRAPHIC:
				return getAreaGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__SIMPLE_GRAPHIC:
				return getSimpleGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC:
				return getGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__ELEMENT:
				return getElement() != null;
			case AAAPackage.DOCUMENT_ROOT__AREA_SYMBOLIZER:
				return getAreaSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__PURE_SYMBOLIZER:
				return getPureSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__SYMBOLIZER:
				return getSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__BOUNDING_BOX_POINT:
				return getBoundingBoxPoint() != null;
			case AAAPackage.DOCUMENT_ROOT__PLACEMENT_RULE:
				return getPlacementRule() != null;
			case AAAPackage.DOCUMENT_ROOT__CENTER_POINT:
				return getCenterPoint() != null;
			case AAAPackage.DOCUMENT_ROOT__CIRCULAR_ARC:
				return getCircularArc() != null;
			case AAAPackage.DOCUMENT_ROOT__PATH_ELEMENT:
				return getPathElement() != null;
			case AAAPackage.DOCUMENT_ROOT__CLOSE:
				return getClose() != null;
			case AAAPackage.DOCUMENT_ROOT__COLOR:
				return getColor() != null;
			case AAAPackage.DOCUMENT_ROOT__COLOR_CMYK:
				return getColorCMYK() != null;
			case AAAPackage.DOCUMENT_ROOT__COLOR_RGB:
				return getColorRGB() != null;
			case AAAPackage.DOCUMENT_ROOT__COMPOSITE_GRAPHIC:
				return getCompositeGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE:
				return getCompoundStroke() != null;
			case AAAPackage.DOCUMENT_ROOT__STROKE:
				return getStroke() != null;
			case AAAPackage.DOCUMENT_ROOT__COMPOUND_STROKE_SECTION:
				return getCompoundStrokeSection() != null;
			case AAAPackage.DOCUMENT_ROOT__CURRENT_STEP:
				return getCurrentStep() != null;
			case AAAPackage.DOCUMENT_ROOT__FIRST_STEP:
				return getFirstStep() != null;
			case AAAPackage.DOCUMENT_ROOT__CURVETO:
				return getCurveto() != null;
			case AAAPackage.DOCUMENT_ROOT__DASHED_STROKE:
				return getDashedStroke() != null;
			case AAAPackage.DOCUMENT_ROOT__SOLID_OR_DASHED_STROKE:
				return getSolidOrDashedStroke() != null;
			case AAAPackage.DOCUMENT_ROOT__DESIGN_RULE:
				return getDesignRule() != null;
			case AAAPackage.DOCUMENT_ROOT__DISPLACEMENT:
				return getDisplacement() != null;
			case AAAPackage.DOCUMENT_ROOT__EMIT:
				return getEmit() != null;
			case AAAPackage.DOCUMENT_ROOT__EVERY:
				return getEvery() != null;
			case AAAPackage.DOCUMENT_ROOT__QUANTIFIER:
				return getQuantifier() != null;
			case AAAPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression() != null;
			case AAAPackage.DOCUMENT_ROOT__FEATURE_TYPE_STEP:
				return getFeatureTypeStep() != null;
			case AAAPackage.DOCUMENT_ROOT__FILL:
				return getFill() != null;
			case AAAPackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case AAAPackage.DOCUMENT_ROOT__FILTERED_SYMBOLIZER:
				return getFilteredSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__FONT:
				return getFont() != null;
			case AAAPackage.DOCUMENT_ROOT__FOR:
				return getFor() != null;
			case AAAPackage.DOCUMENT_ROOT__GAP:
				return getGap() != null;
			case AAAPackage.DOCUMENT_ROOT__GRAPHIC_FILL:
				return getGraphicFill() != null;
			case AAAPackage.DOCUMENT_ROOT__HALO:
				return getHalo() != null;
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL:
				return getHatchFill() != null;
			case AAAPackage.DOCUMENT_ROOT__HATCH_FILL_LONGEST_SIDE:
				return getHatchFillLongestSide() != null;
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES:
				return getHatchLines() != null;
			case AAAPackage.DOCUMENT_ROOT__HATCH_LINES_LONGEST_SIDE:
				return getHatchLinesLongestSide() != null;
			case AAAPackage.DOCUMENT_ROOT__IF:
				return getIf() != null;
			case AAAPackage.DOCUMENT_ROOT__LABEL:
				return getLabel() != null;
			case AAAPackage.DOCUMENT_ROOT__LAYER:
				return getLayer() != null;
			case AAAPackage.DOCUMENT_ROOT__LINE_GRAPHIC:
				return getLineGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__LINE_LABEL:
				return getLineLabel() != null;
			case AAAPackage.DOCUMENT_ROOT__LINE_PLACED_GRAPHIC:
				return getLinePlacedGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__LINE_SYMBOLIZER:
				return getLineSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__LINETO:
				return getLineto() != null;
			case AAAPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral() != null;
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_LINE_STRING:
				return getMaximumAdjacentLineString() != null;
			case AAAPackage.DOCUMENT_ROOT__MAXIMUM_ADJACENT_SURFACE:
				return getMaximumAdjacentSurface() != null;
			case AAAPackage.DOCUMENT_ROOT__MEASURE_LITERAL:
				return getMeasureLiteral() != null;
			case AAAPackage.DOCUMENT_ROOT__MOVETO:
				return getMoveto() != null;
			case AAAPackage.DOCUMENT_ROOT__NULL_COLOR:
				return getNullColor() != null;
			case AAAPackage.DOCUMENT_ROOT__NULL_SYMBOLIZER:
				return getNullSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation() != null;
			case AAAPackage.DOCUMENT_ROOT__PATH:
				return getPath() != null;
			case AAAPackage.DOCUMENT_ROOT__PERPENDICULAR_OFFSET:
				return getPerpendicularOffset() != null;
			case AAAPackage.DOCUMENT_ROOT__POINT_LABEL:
				return getPointLabel() != null;
			case AAAPackage.DOCUMENT_ROOT__POINTS_IN_AREA:
				return getPointsInArea() != null;
			case AAAPackage.DOCUMENT_ROOT__POINTS_ON_LINE:
				return getPointsOnLine() != null;
			case AAAPackage.DOCUMENT_ROOT__POINT_SYMBOLIZER:
				return getPointSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case AAAPackage.DOCUMENT_ROOT__RELATE_GEOMETRY:
				return getRelateGeometry() != null;
			case AAAPackage.DOCUMENT_ROOT__RELATE_TOPOLOGY:
				return getRelateTopology() != null;
			case AAAPackage.DOCUMENT_ROOT__RULE:
				return getRule() != null;
			case AAAPackage.DOCUMENT_ROOT__RULE_SET:
				return getRuleSet() != null;
			case AAAPackage.DOCUMENT_ROOT__SELF_STEP:
				return getSelfStep() != null;
			case AAAPackage.DOCUMENT_ROOT__SHIELDED_POINT_LABEL:
				return getShieldedPointLabel() != null;
			case AAAPackage.DOCUMENT_ROOT__SKELETON_LINE:
				return getSkeletonLine() != null;
			case AAAPackage.DOCUMENT_ROOT__SLOPE_HATCH_LINES:
				return getSlopeHatchLines() != null;
			case AAAPackage.DOCUMENT_ROOT__SOLID_FILL:
				return getSolidFill() != null;
			case AAAPackage.DOCUMENT_ROOT__SOLID_SECTION:
				return getSolidSection() != null;
			case AAAPackage.DOCUMENT_ROOT__SOLID_STROKE:
				return getSolidStroke() != null;
			case AAAPackage.DOCUMENT_ROOT__SOME:
				return getSome() != null;
			case AAAPackage.DOCUMENT_ROOT__STEP:
				return getStep() != null;
			case AAAPackage.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case AAAPackage.DOCUMENT_ROOT__SYMBOLOGY_CATALOG:
				return getSymbologyCatalog() != null;
			case AAAPackage.DOCUMENT_ROOT__TAG:
				return getTag() != null;
			case AAAPackage.DOCUMENT_ROOT__TAG_SET:
				return getTagSet() != null;
			case AAAPackage.DOCUMENT_ROOT__TEXT_GRAPHIC:
				return getTextGraphic() != null;
			case AAAPackage.DOCUMENT_ROOT__TEXT_SECTION:
				return getTextSection() != null;
			case AAAPackage.DOCUMENT_ROOT__TEXT_SYMBOLIZER:
				return getTextSymbolizer() != null;
			case AAAPackage.DOCUMENT_ROOT__TUBE:
				return getTube() != null;
			case AAAPackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable() != null;
			case AAAPackage.DOCUMENT_ROOT__VARIABLE_STEP:
				return getVariableStep() != null;
			case AAAPackage.DOCUMENT_ROOT__VARIANT_GEOMETRY:
				return getVariantGeometry() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
